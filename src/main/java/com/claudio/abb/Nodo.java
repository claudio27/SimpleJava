package com.claudio.abb;

public class Nodo {
	
	int valorRaiz;
	Nodo hijoIzq;
	Nodo hijoDer;
	
	public Nodo(int valor, Nodo izq, Nodo der) {
		this.valorRaiz = valor;
		this.hijoIzq = izq;
		this.hijoDer = der;
	}
	
	public void listar(){
		
		System.out.println(this.valorRaiz);
		
		if(this.hijoIzq != null){
			this.hijoIzq.listar();
		}
		
		if(this.hijoDer != null){
			this.hijoDer.listar();
		}
	}

}
