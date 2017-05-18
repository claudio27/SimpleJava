package com.claudio.estatico.pruebas;

public class Persona {
	
	private String nombre;
	private String apellido;
	private static String variableEstatica = "valor persistente";
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;		
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public static String getVariableEstatica() {
		return variableEstatica;
	}
	
	@Override
	public String toString() {
		return "{" + this.nombre + ", " + this.apellido + "}";
	}

	
	
}
