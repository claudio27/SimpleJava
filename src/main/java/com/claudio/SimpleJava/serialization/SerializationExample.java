package com.claudio.SimpleJava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	public static void main(String[] args) {
		//create an object
		Dog e = new Dog();
		e.setName("bulldog");
		e.setColor("white");
		e.setWeight(5);
 
		//serialize
		try {
			FileOutputStream fileOut = new FileOutputStream("./dog.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized dog is saved in ./dog.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
 
		e = null;
 
		//Deserialize
		try {
			FileInputStream fileIn = new FileInputStream("./dog.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Dog) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Dog class not found");
			c.printStackTrace();
			return;
		}
 
		System.out.println("\nDeserialized Dog ...");
		System.out.println("Name: " + e.getName());
		System.out.println("Color: " + e.getColor());
		System.out.println("Weight: " + e.getWeight());
 
		e.introduce();
 
	}

}
