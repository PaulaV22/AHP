package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import model.BaseDatos;
import model.Criterio;
import model.Decisor;
import model.Pc;
import model.Score;
import model.filtros.Filtro;
import view.VentanaResultados;

public class Controller {
	private BaseDatos bd;
	private Decisor decisor;
	private List<Filtro> filtros;
	private List<Double> comparacionPareada;
	private List<Object> datosIngresados;
	private List<Criterio> criterios;
	
	
	public Controller(){
		bd = new BaseDatos();
		filtros = new ArrayList<>();
		comparacionPareada = new ArrayList<>();
		datosIngresados = new ArrayList<>();
	}
	
	public void setCriterios(List<Criterio> criterios2){
		this.criterios = criterios2;
	}
	public void setFiltros(List<Filtro> filtros){
		this.filtros = filtros;
	}
	
	public void setDatos(List<Object> datos){
		datosIngresados=datos;
	}
	
	public List<Object> getDatos(){
		return datosIngresados;
	}
	
	public void setComparacionPareada(List<Double> puntajes){
		this.comparacionPareada = puntajes;
	}
	
	private List<Pc> getFiltradas(){
		List<Pc> computadoras = bd.getComputadoras();
		List<Pc> filtradas = new ArrayList<>();
		for (Pc pc: computadoras){
			for (Filtro f:filtros){
				if (f.cumple(pc)){
					filtradas.add(pc);
				}
			}
		}
		return filtradas;
	}
	public void buscar (){
		List<Pc> opciones = this.getFiltradas();
		decisor = new Decisor(opciones);
		//decisor.setCriterios(criterios);
		decisor.armarMatrizComparaciones(comparacionPareada);
		decisor.armarMatricesPuntajes(datosIngresados);
		Vector<Score> resultados = decisor.calcular();
		VentanaResultados vr= new VentanaResultados();
		vr.mostrarResultados(resultados);
	}
	
	
}
