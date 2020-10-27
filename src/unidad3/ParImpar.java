package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*En el método main de una clase llamada ParImpar escribe un programa que
			diga si un número introducido por teclado es par o impar.*/
		
		double numero;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca un número entero:");
			numero = teclado.nextDouble();
			
			if (numero%2==0)
			    System.out.printf("El número %.0f es par", numero);
			else
			    System.out.printf("El número %.0f es impar", numero);
		}
	}

}
