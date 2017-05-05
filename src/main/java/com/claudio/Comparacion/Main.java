package com.claudio.Comparacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		List<CarteraDeposito> li = new ArrayList<CarteraDeposito>();
		
		CarteraDeposito c1 = new CarteraDeposito();
		CarteraDeposito c2 = new CarteraDeposito();
		CarteraDeposito c3 = new CarteraDeposito();
		CarteraDeposito c4 = new CarteraDeposito();
		CarteraDeposito c5 = new CarteraDeposito();
		CarteraDeposito c6 = new CarteraDeposito();
		
		
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		li.add(c6);
		
		
		Iterator<CarteraDeposito> it = li.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		Collections.sort(li, new Comparator<CarteraDeposito>(){
//			public int compare(CarteraDeposito c1, CarteraDeposito c2){
//				return c1.getVenceDiaSig() - c2.getVenceDiaSig();
//			}
//		});
		
		Collections.sort(li, new MiComparador("hoy"));
		
		Thread.sleep(4000);
		System.err.println("-------------------------------");
		
		Iterator<CarteraDeposito> it2 = li.iterator();
		
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		Thread.sleep(4000);
		System.err.println("-------------------------------");
	}

}
