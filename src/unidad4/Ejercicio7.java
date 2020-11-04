package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño especificado por el usuario entre 10 y 1.000.000
			de elementos.
			• Llenar el vector con números aleatorios comprendidos entre -999.999 y 1.000.000 sin repetir
			ninguno.
			• Mostrar en la consola los datos siguientes:
			o Tamaño del vector.
			o Tiempo empleado en llenarlo
			o Diferencia entre el menor y el mayor de los números almacenados en el vector.
			o Tiempo empleado en calcular la diferencia entre el menor y el mayor de los números
			almacenados.*/
		int tamaño;
		int i;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir un vector");
			System.out.println("¿Qué tamaño tendrá el vector? Escoja entre 10 y 1000000");
			do {
				tamaño=teclado.nextInt();
				
				if (tamaño < 10 || tamaño > 1000000) {
					System.out.println("No es un tamaño apropiado");
					System.out.println("Por favor, elija un tamaño entre 10 y 1000000");
				}
			}
			while (tamaño < 10 || tamaño > 1000000);
			
			double fillInitTime = System.currentTimeMillis();
			
			int [] vector = new int [tamaño];
			
			for (i = 0; i < vector.length; i++) {
				vector[i] = ((int) Math.floor(Math.random()*2000000) - 999999);
			}
			
			System.out.println("Este es tu vector");
			System.out.println(Arrays.toString(vector));
			
			double fillEndTime = System.currentTimeMillis();
			
			int max = 0;
			int min = 1000000;
			
			for (i=1; i < vector.length; i++){
			    if (vector[i] > max){
			      max = vector[i];
			    }
			  }
			for (i=1; i < vector.length; i++){
			    if (vector[i] < min){
			      min = vector[i];
			    }
			  }
			int dif = max-min;
			
			double endTime = System.currentTimeMillis();
			
			System.out.printf("He tardado en llenar tu vector %.2f segundos\n",(fillEndTime-fillInitTime)/1000);
			System.out.println("La diferencia entre el valor maximo (" + max + ") y el minimo (" + min + ") es "+ dif);
			System.out.printf("He tardado en calcular la diferencia %.2f segundos",(endTime-fillEndTime)/1000);
			
			
		}
			

	}

}
