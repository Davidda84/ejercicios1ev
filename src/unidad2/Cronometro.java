package unidad2;

import java.io.*;
import java.lang.System;

public class Cronometro {
	
	/*En el método main de una clase Java llamada Cronometro escribe un programa
	que pida al usuario que introduzca mediante el teclado su nombre y a
	continuación muestre en la consola un mensaje que incluya un número real que
	represente los segundos y milisegundos que ha tardado en contestar, con un
	formato de salida que emplee exactamente 3 dígitos en la parte decimal.
	Realiza el ejercicio sin utilizar la clase Scanner.*/
	
	public static void main(String[] args) throws IOException {
		System.out.println("Por favor, introduzca su nombre:");
		double initTime = System.currentTimeMillis();
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		String name = teclado.readLine();
		double endTime = System.currentTimeMillis();
		System.out.printf("Hola "+name+", has tardado %.3f segundos en contestarme",(endTime - initTime)/1000);
	}

}
