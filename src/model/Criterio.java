package model;

import java.util.List;

public abstract class Criterio {
	protected String nombre;
	protected Double valor;
	
	
	public Criterio (String n){
		this.nombre = n;
	}
	
	
	public void setValor(Double v){
		this.valor = v;
	}
	
	public Double getValor(){
		return valor;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public abstract List<Double> juntar();
	
	public abstract List<Criterio> getSubcriterios();
}
