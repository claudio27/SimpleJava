package com.claudio.estatico.pruebas;

public class PruebaStatica {
	
	public static void main(String[] args) {
		Persona p = new Persona("nombre1", "apellido1");
		
		System.out.println(p);
		
		p = null;
		
		try {
			
			System.out.println(p.getVariableEstatica());
			System.out.println(p.getNombre());
			System.out.println(p.getApellido());
			
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		
		// No importa si no hay instancias de la clase la variable existe
		System.out.println(Persona.getVariableEstatica());
	}

}
