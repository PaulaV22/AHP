package Controller;

import Model.Pc;

public abstract class Filtro {
	protected String atributo;
	protected Comparable objeto;
	
	public Filtro (String a, Comparable o){
		this.atributo=a;
		this.objeto = o;
	}
	public abstract boolean cumple(Pc pc); 
}
