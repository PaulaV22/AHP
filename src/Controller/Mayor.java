package Controller;

import Model.Pc;

public class Mayor extends Filtro {
	
	public Mayor (String a, Comparable o){
		super (a,o);
	}
	public boolean cumple (Pc pc){
		return this.objeto.compareTo(pc.get(atributo))>0;
	}

}
