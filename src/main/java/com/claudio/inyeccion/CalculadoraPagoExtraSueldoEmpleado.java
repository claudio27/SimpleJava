package com.claudio.inyeccion;

public class CalculadoraPagoExtraSueldoEmpleado implements CalculadoraSueldoEmpleado {

	public float getSueldo(Empleado empleado) {

		return empleado.getSalario() * 2;
	}
}
