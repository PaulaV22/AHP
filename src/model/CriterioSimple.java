package model;

import java.util.ArrayList;
import java.util.List;

public class CriterioSimple extends Criterio {
	private String nombre;
	private Double valor;
	
	public CriterioSimple(String nombre){
		super(nombre);
	}
	
	public void setValor(Double v){
		valor = v;
	}
	
	public Double getValor(){
		return valor;
	}
	
	public List<Double> juntar(){
		List<Double> salida = new ArrayList<>();
		salida.add(this.valor);
		return salida;
	}
	
	public List<Criterio> getSubcriterios(){
		return null;
	}
}

