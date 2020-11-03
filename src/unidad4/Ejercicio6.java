package unidad4;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño aleatorio comprendido entre 10 y 50 elementos.
			• Llenar el vector con números aleatorios comprendidos entre -100 y 100 sin repetir ninguno.
			• Crear un segundo vector que contenga los elementos del anterior almacenados en orden inverso.
			• Mostrar ambos vectores en la consola.*/
		
		int indice = (int) Math.floor(Math.random()*41);
		int [] vector = new int [indice+11];
		int [] inverso = new int [indice+11];
		int x;
		int a = 0;
		
		for (int i = 0; i < vector.length; i++) {

				x  = ((int) Math.floor(Math.random()*198) - 99);
				
				if (Arrays.asList(vector).contains(x)) {
					i--;
				}
				else {
					vector[i] = x;
				}			
		}
		
		for (int j = vector.length-1; j >= 0; j--) {
			inverso [a] = vector [j]; 
			a++;
		}
		System.out.print("Vector -> ");
		System.out.println(Arrays.toString(vector));
		System.out.print("Inverso -> ");
		System.out.println(Arrays.toString(inverso));
	}
}
