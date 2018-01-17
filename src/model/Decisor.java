package model;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class Decisor {
	private List<Matriz> matricesAlternativas; //matrices de comparaciones de alternativas para cada criterio
	private List<Pc> alternativas; //lista con los modelos que cumplen los filtros
	private List<Criterio> criterios;
	private Escala escala;
	
	public Decisor (List<Pc> alternativas ){
		this.alternativas = alternativas;
		matricesAlternativas = new ArrayList<>();
		escala = new Escala();
	}

	public void setCriterios (List<Criterio> criterios){
		this.criterios = criterios;
	}
	
	public void addMatriz(Matriz m){
		matricesAlternativas.add(m);
		
	}
	
	public Matriz getMatrizComparacionCriterios(List<Criterio> criterios, int nivel){
		//HACE UNA MATRIZ PARA LOS CRITERIOS PADRES.SI ALGUN CRITERIO TIENE SUBCRITERIOS SE GENERA UNA MATRIZ APARTE
		//Y SE LA REFERENCIA DESDE EL CRITERIO
		Matriz matrizCriteriosLocal = new Matriz(criterios.size(), criterios.size());
		System.out.println(criterios.size()+" son los criterios");
		for (int f=0; f<criterios.size(); f++){
			Criterio c1 = criterios.get(f);
			List<Criterio> comparaciones = c1.getComparados();
			//System.out.println( "f vale "+f+" "+c1.nombre+ " "+comparaciones.size());
			//SE COMPARA CON EL MISMO
			int c = f;
			matrizCriteriosLocal.set(f, c, 1.0);
			c++;
			//SE COMPARA CON LAS DEMAS COMPARACIONES QUE TENGA EL CRITERIO
			while (c<=comparaciones.size()){
				Criterio c2 = comparaciones.remove(0);
				matrizCriteriosLocal.set(f, c, c1.getComparacion(c2));
				c++;
			}
		    //SI TIENE SUBCRITERIOS SE LLAMA RECURSIVAMENTE A ESTE METODO Y SE GUARDA ESA MATRIZ DE RETORNO EN EL CRITERIO PADRE
			//System.out.println("venia generando la matriz "+ matrizCriterios.toString());
			List<Criterio> subcriterios = c1.getSubcriterios();
			if (!subcriterios.isEmpty()){
				System.out.println("encontro subcriterios de "+c1.nombre);
				Matriz m = this.getMatrizComparacionCriterios(subcriterios, nivel+1);
				//System.out.println("setea la matriz "+m.toString() );
				c1.setMatriz(m);
			}
		}
		matrizCriteriosLocal.complementar();
		System.out.println("retorna la matriz "+ matrizCriteriosLocal.toString() + nivel);

		return matrizCriteriosLocal;
		
	}
	
		
	private List<Criterio> aplanarCriterios(){
		List<Criterio> salida = new ArrayList<>();
		for (Criterio c:criterios){
			salida.addAll(c.getHojas());
		}
		return salida;
	}
	
	 //COMPARACION PAREADA ENTRE ALTERNATIVAS
	public void compararAlternativas(){     
		List<Criterio> criteriosHojas = this.aplanarCriterios();
		for (Criterio c: criteriosHojas) {
			String atributo = c.getNombre();
			Matriz m = new Matriz (alternativas.size(), alternativas.size());
			//COMPARAR CADA PC RESPECTO A OTRA POR EL DATO PASADO Y DESPUES COMPLEMENTAR
			for (int j=0; j<alternativas.size(); j++){
				for (int k=j; k<alternativas.size(); k++){
					if (k==j){
						m.set(j, k, 1.0);
					}
					else {
						Double v1 = (Double) alternativas.get(j).get(atributo);
						Double v2 = (Double) alternativas.get(k).get(atributo);
						Double valorBuscado = (Double) c.getValor();
						Double maxValor = getMax(atributo);
						Double dif1= Math.abs(valorBuscado - v1)/maxValor; 
						Double dif2= Math.abs(valorBuscado - v2) /maxValor;
						Double valorFinal1;
						Double valorFinal2;
						if (dif1<=dif2){
							valorFinal1=escala.get(dif2-dif1);
							valorFinal2= (1/valorFinal1);
						}
						else {
							valorFinal2=escala.get(dif1-dif2);
							valorFinal1= (1/valorFinal2);
						}
						m.set(j, k, valorFinal1);
						m.set(k, j, valorFinal2);
					}
				}
			}
			matricesAlternativas.add(m);
		}
	}
	
	private Matriz generarMatrizFinal(List<Vector<Double>> vectores, Vector<Double> ponderacionesCriterios){
		Matriz salida = new Matriz (0,0);
		for (int i=0; i<vectores.size(); i++){
			salida.addColumna(vectores.get(i));
		}
		salida.addFila(ponderacionesCriterios);
		return salida;
	}
	
	private Vector<Score> getScores(Matriz m){
		Vector <Score> salida = new Vector<Score>();
		for (int f=0; f<m.filas()-1; f++){
			Score nuevo = new Score ((String)alternativas.get(f).get("modelo"), 0.0);
			for (int c=0; c<m.columnas(); c++){
				double s = nuevo.getScore()+m.get(f, c)*m.get(m.filas()-1, c); //multiplica cada casillero de la fila por cada casillero de la ultima fila
				nuevo.setScore(s);
			}
			salida.add(nuevo);
		}
		return salida;
	}
	
	private Vector<Double> getPonderacionesCriteriosHojas(){
		Vector<Double> salida = new Vector<Double>();
		for (Criterio c:criterios){
			salida.addAll(c.getPonderaciones());
		}
		return salida;
	}
	
	private Double getMax(String atributo){
		Double max = -1.0;
		for (Pc pc: alternativas){
			if ((Double)pc.get(atributo)>max)
				max = (Double)pc.get(atributo);
			}
		return max;
	}
	
	
	public Vector<Score> calcular(){
		List<Vector<Double>> vectores = new ArrayList<>();
		//OBTIENE EL VECTOR DE CADA MATRIZ DE ALTERNATIVAS
		for (Matriz m: matricesAlternativas){   
			Vector <Double> v = m.getVector();
			vectores.add(v);
		}
		//OBTIENE EL VECTOR DE COMPARACION DE CRITERIOS PARA TODOS LOS CRITERIOS DEL NIVEL SUPERIOR, TENGAN O NO SUBCRITERIOS
		Vector<Double> ponderaciones = matrizCriterios.getVector();
		for (int i=0; i<ponderaciones.size(); i++){
			criterios.get(i).setPonderacion(ponderaciones.get(i));  //SETEA LA PONDERACION DE CADA CRITERIO PADRE
		}
		Vector<Double> ponderacionCriteriosFinales = this.getPonderacionesCriteriosHojas();
		//GENERA LA MATRIZ FINAL 
		Matriz scores = this.generarMatrizFinal(vectores, ponderacionCriteriosFinales);
		Vector<Score> salida = this.getScores(scores);
		salida.sort(new ComparadorScores());
		return salida;		
	}
	
	
/*	
	
	
	public static void main(String[] args) {
		Pc pc1=new Pc();
		Pc pc2=new Pc();
		Pc pc3=new Pc();
		Pc pc4=new Pc();
		pc1.set("modelo", "15-cb001la");
		pc1.set("marca","HP");
		pc1.set("precio",15000);
		pc1.set("pantalla",15.6);
		pc1.set("procesador","intel icore5 7300HQ");
		pc1.set("ram",8);
		pc1.set("autonomia",11);
		pc1.set("peso",2.21);
		pc1.set("almacenamiento",1000);
		pc2.set("modelo", "14-bs001la");
		pc2.set("marca","HP");
		pc2.set("precio",15000);
		pc2.set("pantalla",15.6);
		pc2.set("procesador","intel icore5 7300HQ");
		pc2.set("ram",8);
		pc2.set("autonomia",11);
		pc2.set("peso",2.21);
		pc2.set("almacenamiento",1000);
		pc3.set("modelo", "15-bs001la");
		pc3.set("marca","HP");
		pc3.set("precio",15000);
		pc3.set("pantalla",15.6);
		pc3.set("procesador","intel icore5 7300HQ");
		pc3.set("ram",8);
		pc3.set("autonomia",11);
		pc3.set("peso",2.21);
		pc3.set("almacenamiento",1000);
		pc4.set("modelo", "15-ba001la");
		pc4.set("marca","HP");
		pc4.set("precio",15000);
		pc4.set("pantalla",15.6);
		pc4.set("procesador","intel icore5 7300HQ");
		pc4.set("ram",8);
		pc4.set("autonomia",11);
		pc4.set("peso",2.21);
		pc4.set("almacenamiento",1000);
		List<Pc> alternativas=new ArrayList<>();
		alternativas.add(pc1);
		alternativas.add(pc2);
		alternativas.add(pc3);
		alternativas.add(pc4);
		Decisor d=new Decisor(alternativas);
		List<String> ops=new ArrayList<>();
		ops.add("compu1");
		ops.add("compu2");
		ops.add("compu3");
		ops.add("compu4");
		Matriz matrizC=new Matriz(4,4);
		for(int i=0;i<ops.size();i++)
			for(int j=0;j<ops.size();j++)
				matrizC.set(i, j, 1.0);
		Matriz matrizC2=new Matriz(8,8);
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				matrizC2.set(i, j, 1.0);
		Matriz matrizC3=new Matriz(2,2);
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				matrizC3.set(i, j, 1.0);
		matrizC3.set(0, 0, 1.0);
		matrizC3.set(0, 1, 2.0);
		matrizC3.set(1, 0, 0.5);
		matrizC3.set(1, 1, 1.0);
		Decisor d2=new Decisor(alternativas);
		d2.addMatriz(matrizC3);
		d2.addMatriz(matrizC);
		d2.addMatriz(matrizC);
		d.addMatriz(matrizC2);
		
		
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		d.addMatriz(matrizC);
		Vector<Score> scores=d.calcular();
		for(int i=0;i<scores.size();i++)
			System.out.println(scores.get(i).toString());
	}
	*/
}
