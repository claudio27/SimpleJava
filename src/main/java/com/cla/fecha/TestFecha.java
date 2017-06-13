package com.cla.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date d1 = sdf.parse("20sdf70123");
		
		System.out.println(d1);		
		
	}
}
