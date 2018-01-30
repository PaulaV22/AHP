package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import model.filtros.Filtro;
import model.filtros.Igual;
import model.filtros.MayorIgual;

public class GeneradorFiltros {
	private Hashtable<String, List<Filtro>> filtros;
	
	public GeneradorFiltros(){
		filtros = new Hashtable<>();
	}
	
	public void filtrarProgramacionBaja(String nombre){
		List<Filtro> listaFiltros = new ArrayList<>();
		MayorIgual f1 = new MayorIgual ("mhz",1000);
		MayorIgual f2 = new MayorIgual ("ram", 512);
		MayorIgual f3 = new MayorIgual ("capacidad",1000);
		Igual f4 = new Igual ("intenet", 1);
		listaFiltros.add(f1);
		listaFiltros.add(f2);
		listaFiltros.add(f3);
		listaFiltros.add(f4);
		filtros.put(nombre,listaFiltros);
	}
	
	public void filtrarProgramacionMedia(String nombre){
		List<Filtro> listaFiltros = new ArrayList<>();
		MayorIgual f1 = new MayorIgual ("mhz",1200);
		MayorIgual f2 = new MayorIgual ("ram", 4000);
		MayorIgual f3 = new MayorIgual ("capacidad",1000);
		MayorIgual f4 = new MayorIgual ("directx", 9);
		MayorIgual f5 = new MayorIgual ("nucleos",4);
		listaFiltros.add(f1);
		listaFiltros.add(f2);
		listaFiltros.add(f3);
		listaFiltros.add(f4);
		listaFiltros.add(f5);
		filtros.put(nombre,listaFiltros);
	}
	
	public void filtrarProgramacionAlta(String nombre){
		List<Filtro> listaFiltros = new ArrayList<>();
		MayorIgual f1 = new MayorIgual ("mhz",1800);
		MayorIgual f2 = new MayorIgual ("ram", 8000);
		MayorIgual f3 = new MayorIgual ("capacidad",50000);
		MayorIgual f4 = new MayorIgual ("directx", 9);
		MayorIgual f5 = new MayorIgual ("resolucion", 1280*720);
		Igual f6 = new Igual ("internet",1);
		Igual f7 = new Igual ("ssd",1);
		MayorIgual f8 = new MayorIgual ("nucleos",8);
		listaFiltros.add(f1);
		listaFiltros.add(f2);
		listaFiltros.add(f3);
		listaFiltros.add(f4);
		listaFiltros.add(f5);
		listaFiltros.add(f6);
		listaFiltros.add(f7);
		listaFiltros.add(f8);
		filtros.put(nombre,listaFiltros);
	}
	
	
	
}
