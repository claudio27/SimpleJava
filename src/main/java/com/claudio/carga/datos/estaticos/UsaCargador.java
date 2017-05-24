package com.claudio.carga.datos.estaticos;

import com.claudio.carga.datos.estaticos.paquete1.Cargador;

public class UsaCargador {
	
	private static UsaCargador instancia = null;
	
	private UsaCargador() {
	
	}

	
	/** 
	 * Para probar que Cargador solo inicializa las variables
	 * estaticas la primera vez que es creado.
	 * 
	 * 
	 */
	public static UsaCargador getInstancia() {
		if(instancia == null)
			instancia = new UsaCargador();
		return instancia;
		
	}
	
	public String getValor(){
		return Cargador.getVar();
	}
	
	
	
	

}
