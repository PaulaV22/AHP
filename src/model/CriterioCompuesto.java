package model;

import java.util.ArrayList;
import java.util.List;

public class CriterioCompuesto extends Criterio {
	
	private List<Criterio> subcriterios;
	
	public CriterioCompuesto(String nombre) {
		super(nombre);
		subcriterios = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void addSubcriterio(Criterio c){
		this.subcriterios.add(c);
	}
	
	public List<Double> juntar(){
		List<Double> salida = new ArrayList<>();
		for (Criterio c:subcriterios){
			for (Double val: c.juntar()){
				Double nuevo = this.valor * val;
				salida.add(nuevo);
			};
		}
		return salida;
	}
	
	public List<Criterio> getSubcriterios(){
		return subcriterios;
	}

}
