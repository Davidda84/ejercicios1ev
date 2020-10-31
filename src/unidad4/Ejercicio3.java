package unidad4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Programa que lea dos cadenas desde el teclado y muestre el número de veces que la segunda está
		contenida en la primera.*/
		
		String cadena1,cadena2;
		int contador=0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca un texto: ");
			cadena1 = teclado.nextLine();
			System.out.println("Introduzca la busqueda a realizar en el texto: ");
			cadena2 = teclado.nextLine();
			
			while (cadena1.indexOf(cadena2) > -1) {
				cadena1 = cadena1.substring(cadena1.indexOf(cadena2)+cadena2.length(),cadena1.length());
			      contador++; 
			}
			if (contador == 0) {
				System.out.println("No existen coincidencias");
			}
			else if (contador == 1){
				System.out.println("Se han encontrado " + contador + " coincidencia");
			}
			else {
				System.out.println("Se han encontrado " + contador + " coincidencias");
			}
		}
	}
}
