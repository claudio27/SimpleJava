package com.claudio.Comparacion;

import java.util.Comparator;

public class MiComparador implements Comparator<CarteraDeposito> {

	private String columna;
	
	public MiComparador(String columna) {
		this.columna = columna;
	}
	
	public int compare(CarteraDeposito o1, CarteraDeposito o2) {
		
		int result = 0;
		
		if(columna.equals("diaSig"))
			result =  o1.getVenceDiaSig() - o2.getVenceDiaSig();
		else if(columna.equals("hoy"))
			result = o1.getVenceHoy() - o2.getVenceHoy();
		else if(columna.equals("vencidos"))
			result = o1.getVencidos() - o2.getVencidos();
		
		return result;
	}
	
	

}
