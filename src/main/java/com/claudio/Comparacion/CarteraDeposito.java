package com.claudio.Comparacion;

public class CarteraDeposito {

	private String rut;
	private String nombre;
	private int venceHoy;
	private int venceDiaSig;
	private int vencidos;

	public CarteraDeposito() {
		this.rut = GeneradorDeCadenas.generaCadena();
		this.nombre = GeneradorDeCadenas.generaCadena();
		this.venceHoy = (int) (Math.random() * 50 + 1);
		this.venceDiaSig = (int) (Math.random() * 50 + 1);
		this.vencidos = (int) (Math.random() * 50 + 1);
	}
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVenceHoy() {
		return venceHoy;
	}

	public void setVenceHoy(int venceHoy) {
		this.venceHoy = venceHoy;
	}

	public int getVenceDiaSig() {
		return venceDiaSig;
	}

	public void setVenceDiaSig(int venceDiaSig) {
		this.venceDiaSig = venceDiaSig;
	}

	public int getVencidos() {
		return vencidos;
	}

	public void setVencidos(int vencidos) {
		this.vencidos = vencidos;
	}
	
	@Override
	public String toString() {
		return "[" + this.rut + ", " + this.nombre + ", " + this.venceHoy + ", " + this.venceDiaSig + ", "
				+ this.vencidos + "]";
	}

}
