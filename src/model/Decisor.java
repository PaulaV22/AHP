package model;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class Decisor {
	private List<MatrizI> matrices; //la primera matriz es la de comparacion de criterios
	private List<Pc> alternativas; //lista con los modelos que cumplen los filtros
	private List<String> criterios;
	private Escala escala;
	
	
	
	
	public Decisor (List<Pc> alternativas ){
		this.matrices = new ArrayList<>();
		this.alternativas = alternativas;
		escala = new Escala();
	}

	public void setCriterios (List<String> criterios){
		this.criterios = criterios;
	}
	
	public void addMatriz(MatrizI m){
		matrices.add(m);
	}

	
	public void armarMatrizComparaciones(List<Double> comparacionPareada){
		
		Matriz matrizCriterios = new Matriz (criterios.size(),criterios.size(), null);
		for(int f=0;f<criterios.size();f++){ ///Intento de arreglo 
			for(int c=0;c<criterios.size();c++){
				if(c>f){ ///Agrego de comparacion pareada si esta en la mitad correcta de la matriz
					matrizCriterios.set(f, c, comparacionPareada.remove(0));// Tira error porque comparacionPareada llega vacia
				}
				if(c==f) //Si esta en la diagonal pongo un 1
					matrizCriterios.set(f, c, 1.0);
			}
		}
/*
		for (int f = 0; f<criterios.size(); f++){
			int c = f;
			matrizCriterios.set(f, c, 1.0);
			for (c = f+1; c<criterios.size(); c++){
				matrizCriterios.set(f, c, comparacionPareada.remove(0));
			}
		}*/
		matrizCriterios.complementar();
		matrices.add(matrizCriterios);
	}
	
	public void armarMatricesPuntajes(List<Object> datos){
		for (int i=0; i<criterios.size(); i++){
			String atributo = criterios.get(i);
			Matriz m = new Matriz (alternativas.size(), alternativas.size(), null);
			//COMPARAR CADA PC RESPECTO A OTRA POR EL DATO PASADO Y DESPUES COMPLEMENTAR
			for (int j=0; j<alternativas.size(); j++){
				for (int k=j; k<alternativas.size(); j++){
					Double v1 = (Double) alternativas.get(j).get(atributo);
					Double v2 = (Double) alternativas.get(k).get(atributo);
					Double valorBuscado = (Double) datos.get(i);
					Double dif1= Math.abs(valorBuscado - v1)/(this.getMax(atributo)); //DIVIDIRLO POR EL MAX NUM EN ESE ATRIBUTO.
					Double dif2= Math.abs(valorBuscado - v2) /(this.getMax(atributo)); //DIVIDIRLO POR EL MAX NUM EN ESE ATRIBUTO.
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
	}
	
	private Matriz generarMatriz(List<Vector<Double>> vectores){
		Matriz salida = new Matriz (0,0, null);
		for (int i=0; i<vectores.size()-1; i++){
			salida.addColumna(vectores.get(i));

		}

		System.out.println(salida+"\n"+vectores.get(vectores.size()-1));
		salida.addFila(vectores.get(vectores.size()-1));
		return salida;
	}
	
	private Vector<Score> getScores(Matriz m){
		Vector <Score> salida = new Vector<>();
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
		for (MatrizI m: matrices){
			Vector <Double> v = m.getVector();
			vectores.add(v);
		}
		if (vectores.size()>0){
			Vector<Double> aux = vectores.remove(0); //pone al final el vector de los criterios para
			vectores.add(aux);				// que quede al final en la matriz de scores globales
		}

	
		Matriz scores = this.generarMatriz(vectores);
		Vector<Score> salida = this.getScores(scores);
		salida.sort(new ComparadorScores());
		return salida;		
	}
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
		Matriz matrizC=new Matriz(4,4,ops);
		for(int i=0;i<ops.size();i++)
			for(int j=0;j<ops.size();j++)
				matrizC.set(i, j, 1.0);
		Matriz matrizC2=new Matriz(8,8,null);
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				matrizC2.set(i, j, 1.0);
		Matriz matrizC3=new Matriz(2,2,null);
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
		MatrizComp matComp=new MatrizComp(d2);
		d.addMatriz(matrizC2);
		d.addMatriz(matComp);
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
	
}
