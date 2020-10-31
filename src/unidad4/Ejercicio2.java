package unidad4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Programa que lea una cadena en desde el teclado y la muestre invertida en la consola.*/
		
		String entrada,salida;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca una cadena:");
			entrada = teclado.nextLine(); 
					
			StringBuilder invertido = new StringBuilder(entrada);
			
			
			salida = invertido.reverse().toString();
			System.out.println("Cadena invertida: " + salida);
		}

	}

}
