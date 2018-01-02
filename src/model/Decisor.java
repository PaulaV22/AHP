package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Decisor {
	private List<Matriz> matrices; //la primera matriz es la de comparacion de criterios
	private List<Matriz> normalizadas;
	private List<String> alternativas;
	
	public Decisor (List<Pc> alternativas){
		this.matrices = new ArrayList<>();
		this.normalizadas = new ArrayList<>();
		for (Pc pc:alternativas){
			this.alternativas.add((String) pc.get("modelo"));
		}; 
	}

	
	public void addMatriz(Matriz m){
		matrices.add(m);
	}
	
	public void addNormalizada (Matriz m){
		normalizadas.add(m);
	}
	
	private Matriz generarMatriz(List<Vector<Double>> vectores){
		Matriz salida = new Matriz (0,0, null);
		for (int i=0; i<vectores.size()-1; i++){
			salida.addColumna(vectores.get(i));
		}
		salida.addFila(vectores.get(vectores.size()-1));
		return salida;
	}
	
	private Vector<Score> getScores(Matriz m){
		Vector <Score> salida = new Vector<>();
		for (int f=0; f<m.filas()-1; f++){
			Score nuevo = new Score (alternativas.get(f), 0.0);
			for (int c=0; c<m.columnas(); c++){
				double s = nuevo.getScore()+m.get(f, c)*m.get(m.filas()-1, c); //multiplica cada casillero de la fila por cada casillero de la ultima fila
				nuevo.setScore(s);
			}
			salida.add(nuevo);
		}
		return salida;
	}
	
	public Vector<Score> calcular(){
		List<Vector<Double>> vectores = new ArrayList<>();
		for (Matriz m: matrices){
			Matriz normal = m.getMatrizNormal();
			this.addNormalizada(normal);
		}
		for (Matriz m: normalizadas){
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
	
	
}
