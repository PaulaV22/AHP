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
	
	public Controller(){
		bd = new BaseDatos();
	}
	
	public void buscar (Filtro f1, Filtro f2){
		List<Pc> computadoras = bd.getComputadoras();
		List<Pc> filtradas = new ArrayList<>();
		for (Pc pc: computadoras){
			if(f1.cumple(pc) && f2.cumple(pc))
				filtradas.add(pc);
		}
		decisor = new Decisor(filtradas);
		Vector<Score> resultados =decisor.calcular();
		VentanaResultados vr= new VentanaResultados();
		vr.mostrarResultados(resultados);
	}
}
