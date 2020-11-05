package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño especificado por el usuario que esté
			comprendido entre 10 y 20 elementos.
			• Llenar el vector con números aleatorios.
			• Mostrar el contenido del vector.
			• Mostrar la mínima diferencia entre dos valores adyacentes. La diferencia entre dos valores
			adyacentes se calcula como el valor almacenado en cada posición [i] (excepto la primera) menos el
			valor almacenado en la posición [i-1].*/
		
		int tamaño;
		Random valor = new Random();
		int min=10000000;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir un vector");
			System.out.println("¿Qué tamaño tendrá el vector? Escoja entre 10 y 20");
			
			do {
				tamaño=teclado.nextInt();
				
				if (tamaño < 10 || tamaño > 20) {
					System.out.println("No es un tamaño apropiado");
					System.out.println("Por favor, elija un tamaño entre 10 y 20");
				}
			}
			
			while (tamaño < 10 || tamaño > 20);
			
			int [] vector = new int [tamaño];
			
			for (int i = 0; i < vector.length; i++) {
				vector[i] = valor.nextInt();
			}
			
			for (int i = 1; i < vector.length; i++) {
				if (i > 1) {
					if (Math.abs(vector[i] - vector[i-1]) < min) {
						min = Math.abs(vector[i] - vector[i-1]);
						System.out.println("i: "+ i +" min: " + min);
					}
				}
				else {
					min = Math.abs(vector[i] - vector[i-1]);
					System.out.println("Primer min: " + min);
				}
				
			}
			System.out.println("Este es tu vector");
			System.out.println(Arrays.toString(vector));
			System.out.println("La diferencia minima entre dos numeros adyacentes es " + min);
		}

	}

}
