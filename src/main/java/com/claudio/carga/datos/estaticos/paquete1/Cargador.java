package com.claudio.carga.datos.estaticos.paquete1;

public class Cargador {

	private static String var;
	
	static {

		System.out.println("ClaseAyudante1 creada ok");
		var = "componente Ayudante2 estatico creado";
	}

	public static String getVar() {
		return var;
	}	
	

}
