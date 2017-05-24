package com.claudio.carga.datos.estaticos;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println(UsaCargador.getInstancia().getValor());
        
        System.out.println("***********************");
        
        Thread.sleep(2000);
        
        // No deberia mostrar el mensaje del bloque estatico de Cargador.java
        System.out.println(UsaCargador.getInstancia().getValor());
        System.out.println(UsaCargador.getInstancia().getValor());
        System.out.println(UsaCargador.getInstancia().getValor());
        System.out.println(UsaCargador.getInstancia().getValor());
        System.out.println(UsaCargador.getInstancia().getValor());
        
        
    }
}
