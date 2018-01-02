package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import model.BaseDatos;
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
	
	
	public Controller(){
		bd = new BaseDatos();
		filtros = new ArrayList<>();
		comparacionPareada = new ArrayList<>();
		datosIngresados = new ArrayList<>();
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
	
	public void buscar (){
		List<Pc> computadoras = bd.getComputadoras();
		List<Pc> filtradas = new ArrayList<>();
		for (Pc pc: computadoras){
			for (Filtro f:filtros){
				if (f.cumple(pc)){
					filtradas.add(pc);
				}
			}
		}
		decisor = new Decisor(filtradas);
		Vector<Score> resultados = decisor.calcular();
		VentanaResultados vr= new VentanaResultados();
		vr.mostrarResultados(resultados);
	}
	
	//DEBERIA RECIBIR LOS DATOS CARGADOS POR EL USUARIO Y CREAR EL MODELO (LAS MATRICES) Y PASARSELAS AL DECISOR,
	//O BIEN TENER LOS DATOS 
	//Y PASARSELOS AL DECISOR Y QUE EL DECISOR ARME LAS MATRICES 
}
