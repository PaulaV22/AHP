package test;

import model.BaseDatos;
import model.Pc;

public class TestConFiltros {
	
	
	public static void main (String args[]){
		BaseDatos bd = new BaseDatos();

		Pc pc1 = new Pc();
		pc1.set("modelo", "pc1");
		pc1.set("ssd", 1);
		pc1.set("capacidad", 100000);
		pc1.set("ram", 16000);
		pc1.set("nucleos", 8);
		pc1.set("directx", 9);
		pc1.set("resolucion", 1280*720);
		pc1.set("mhz", 2600);
		pc1.set("internet",1);

		Pc pc2 = new Pc();
		pc2.set("modelo", "pc2");
		pc2.set("ssd", 0);
		pc2.set("capacidad", 1000);
		pc2.set("ram", 8000);
		pc2.set("nucleos", 4);
		pc2.set("directx", 9);
		pc2.set("resolucion", 123*1220);
		pc2.set("mhz", 1850);
		pc2.set("inter100000net",1);
		
		Pc pc3 = new Pc();
		pc3.set("modelo", "pc3");
		pc3.set("ssd", 0);
		pc3.set("capacidad", 1000);
		pc3.set("ram", 3000);
		pc3.set("nucleos", 1);
		pc3.set("directx", 0);
		pc3.set("resolucion", 230*232);
		pc3.set("mhz", 1200);
		pc3.set("internet",1);
		
		bd.addComputadora(pc1);
		bd.addComputadora(pc2);
		bd.addComputadora(pc3);
		
		//HACER QUE LA BASE DE DATOS DEVUELVA FILTRADAS
	}
	

	
}
