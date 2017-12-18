package Model;

import java.util.Hashtable;

public class Pc {
	private Hashtable<String, Object> atributos;
	
	public Pc(){
		atributos = new Hashtable<>();
	}
	public void set(String a, Object o){
		atributos.put(a, o);
	}
	public Object get(String a){
		if (atributos.containsKey(a))
			return atributos.get(a);
		return null;
	}
}
