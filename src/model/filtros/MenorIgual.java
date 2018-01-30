package model.filtros;

import model.Pc;

public class MenorIgual extends Filtro{
	
	public MenorIgual(String a, Comparable o){
		super (a,o);
	}
	public boolean cumple (Pc pc){
		return this.objeto.compareTo(pc.get(atributo))<=0;
	}

}
