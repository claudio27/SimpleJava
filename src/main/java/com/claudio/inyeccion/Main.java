package com.claudio.inyeccion;

public class Main {

	
	public static void init() {
		
		CalculadoraSueldoEmpleado calculoBasico = new CalculadoraBasicaSueldoEmpleado();
		CalculadoraSueldoEmpleado calculoExtra = new CalculadoraPagoExtraSueldoEmpleado();
		
		Empleado empleado = new Empleado();
		
		empleado.calculaSalario(calculoBasico);
		empleado.calculaSalario(calculoExtra);
		
	}
	
	
	public static void main(String[] args) {
		
		Main.init();
	}
}
