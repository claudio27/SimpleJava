package com.claudio.abb;

public class ArbolBin {
	
	Nodo raiz;
	
	public void listarArbol(){
		
		this.raiz.listar();		
	}
	
	public static void main(String[] args) {
		
		Nodo abb = new Nodo(1, 
				new Nodo(2, null, null),
				new Nodo(3, 
						new Nodo(4, 
								new Nodo(5, 
										new Nodo(6, 
												new Nodo(200, new Nodo(24, new Nodo(23, null, new Nodo(555, null, null)),
														null), null), null), null), null), null)
				);

		abb.listar();
	}

}
