package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño especificado por el usuario que estará
			comprendido entre 10 y 200 elementos.
			• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
			• Mostrar la suma de los números almacenados teniendo en cuenta que hay quien piensa que el
			número 13 es el número de la mala suerte. Por tanto, si en alguna posición se encuentra
			almacenado el número 13, no se sumará ni este número ni los que se encuentren almacenados en
			las 13 posiciones siguientes (o las que haya hasta el final del vector si estas son menos de 13) si la
			suma de todos ellos es distinta de 7.
			• Mostrar el contenido del vector y la cantidad de números que no se han sumado.*/
		
		int tamaño;
		int contador = 0;
		int suma = 0;
		int suma13 = 0;
		int contador13 = 0;
		int contador7 = 0;
		int j = 0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir un vector");
			System.out.println("¿Qué tamaño tendrá el vector? Escoja entre 10 y 200");
			
			do {
				tamaño=teclado.nextInt();
				
				if (tamaño < 10 || tamaño > 200) {
					System.out.println("No es un tamaño apropiado");
					System.out.println("Por favor, elija un tamaño entre 10 y 200");
				}
			}
			
			while (tamaño < 10 || tamaño > 200);
			
			int [] vector = new int [tamaño];
			
			for (int i = 0; i < vector.length; i++) {
				vector[i] = ((int) Math.floor(Math.random()*201) - 100);
			}
			
			for (int x : vector) {
				
				if ( x == 13) {
					contador13++;
					contador--;
					int dimension = vector.length - j;
					if (dimension < 14) {
						suma13 = 0;
						for(int k = j+1; k < vector.length; k++) {
							suma13 += vector [k];
						}
						if (suma13 == 7) {
							contador -= (dimension - 1 );
							contador7++;
						}
					}
					else {
						suma13 = 0;
						for(int l = j+1; l < j+14; l++) {
							suma13 += vector [l];
						}
						if (suma13 == 7) {
							contador -= 13;
							contador7++;
						}
					}
				}
				suma = suma + vector [j];
				j++;
				
				contador++;
			}

			suma = suma - contador13*13 - contador7*7;
			
			System.out.println("Este es tu vector");
			System.out.println(Arrays.toString(vector));
			System.out.println("La suma de los números que componen el vector es " + suma);
			if (vector.length-contador == 0) {
				System.out.println("Hemos tenido buena suerte");
			}
			else if(vector.length-contador == 1 ) {
				System.out.println("No se ha sumado un elemento de la matriz por tratarse de un 12+1");
			}
			else{
				System.out.println("No se han sumado " + (vector.length-contador) + " números, evitemos la mala suerte");
			}
		}
	}
}
