package com.claudio.inyeccion;

public class CalculadoraBasicaSueldoEmpleado implements CalculadoraSueldoEmpleado {

	public float getSueldo(Empleado empleado) {
		
		return empleado.getSalario();
	}

}
