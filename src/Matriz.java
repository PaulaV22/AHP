import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Matriz {
	protected int maxFilas;
	protected int maxColumnas;
	protected double[][] matriz;
	private List<String> opciones; ///tanto criterios como opciones de pcs
	
	public Matriz(int mf, int mc, List<String> ops){
		if (ops == null){
			maxFilas= mf;
			maxColumnas= mc;
		} 
		else{
			maxFilas = ops.size();
			maxColumnas = ops.size();
		}
		opciones = ops;
		matriz = new double [maxFilas][maxColumnas];
	}

	public double get (int f, int c){
		return matriz[f][c];
	}
	
	public void set (int f, int c, double d){
		matriz[f][c] = d;
	}
	
	public double getPromedioFila(int f){
		double totalFila= 0.0;
		for (int c=0; c<maxColumnas; c++){
			totalFila = totalFila + matriz [f][c]; 
		}
		return totalFila/maxColumnas;
	}
	
	public double getPromedioColumna(int c){
		double totalColumna= 0.0;
		for (int f=0; f<maxFilas; f++){
			totalColumna = totalColumna + matriz [f][c]; 
		}
		return totalColumna/maxFilas;
	}
	
	public double sumaFila(int f){
		double salida = 0.0;
		for (int c=0; c<maxColumnas; c++){
			salida= salida + matriz[f][c];
		}
		return salida;
	}
	
	public double sumaColumna(int c){
		double salida = 0.0;
		for (int f=0; f<maxFilas; f++){
			salida = salida + matriz [f][c];
		}
		return salida;
	}
	public Matriz getMatrizNormal(){
		Matriz salida = new Matriz(maxFilas, maxColumnas, opciones);
		for (int f=0; f<maxFilas; f++)
			for (int c=0; c<maxColumnas; c++){
				salida.set(f, c, this.get(f, c)/this.sumaColumna(c));
			}
		return salida;
	}
	
	public Vector<Double> getVector(){
		Vector<Double> salida = new Vector<>();
		for (int f=0; f<maxFilas; f++){
			salida.add(this.getPromedioFila(f));
		}
		return salida;
	}
	
}
