package model;

import java.util.Vector;

public class MatrizComp implements MatrizI{
private Decisor d;
	
	public MatrizComp(Decisor d) {
	super();
	this.d = d;
}

	public Vector<Double> getVector(){
		Vector<Score> vector=d.calcular();
		Vector<Double> salida=new Vector<>();
		for(int i=0;i<vector.size();i++)
			salida.add( (vector.get(i)).getScore());
			System.out.println("aca");
		return salida;
	}
}
