package model.filtros;

import model.Pc;

public class MayorIgual extends Filtro {
	
	public MayorIgual (String a, Comparable o){
		super (a,o);
	}
	public boolean cumple (Pc pc){
		return this.objeto.compareTo(pc.get(atributo))>=0;
	}

}
