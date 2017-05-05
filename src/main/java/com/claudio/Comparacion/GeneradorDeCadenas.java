package com.claudio.Comparacion;

public class GeneradorDeCadenas {
	
	private static String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnoprstuvxyz0123456789";
	
	public static String generaCadena(){
		
		
		StringBuilder resultado = new StringBuilder();
		
		for(int i = 0; i < 10; i++){
			resultado.append(
					ALFABETO.charAt((int) (Math.random() * 56 + 1))
					);
		}
		
		return resultado.toString();
		
	}

}
