package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño aleatorio entre 10 y 500 elementos.
			• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
			• Mostrar el contenido del vector si su tamaño es menor o igual a 50.
			• Mostrar, independientemente del tamaño del vector, el número de secuencias de números
			repetidos.
			Ejemplo:
				9 | 2 | 2 | 3 | 2 | 5 | 7 | 7 | 7 | 4 → 2 secuencias*/
		
		int tamaño;
		int secuencia = 0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir un vector");
			System.out.println("¿Qué tamaño tendrá el vector? Escoja entre 10 y 500");
			
			do {
				tamaño=teclado.nextInt();
				
				if (tamaño < 10 || tamaño > 500) {
					System.out.println("No es un tamaño apropiado");
					System.out.println("Por favor, elija un tamaño entre 10 y 500");
				}
			}
			
			while (tamaño < 10 || tamaño > 500);
			
			int [] vector = new int [tamaño];
			
			for (int i = 0; i < vector.length; i++) {
				vector[i] = ((int) Math.floor(Math.random()*201) - 100);
			}
			
			if (tamaño > 50) {
				System.out.println("Este es tu vector");
				System.out.println(Arrays.toString(vector));
			}
			else {
				System.out.println("Su vector no se mostrará, al tener un tamaño menor o igual a 50");
			}
			
			for (int i = 1; i < vector.length; i++) {
				if (vector[i] == vector[i-1]) {
						secuencia++;
						if (i > 1 && vector[i] == vector[i-2]) {
							secuencia--;
						}
				}
			}
			
			if (secuencia == 0) {
				System.out.println("En su vector no existen secuencias de numeros repetidos");
			}
			else if (secuencia == 1) {
				System.out.println("En su vector existe 1 secuencia de numeros repetidos");
			}
			else {
				System.out.println("En su vector existen " + secuencia + " secuencias de numeros repetidos");
			}
		}
	}
}
