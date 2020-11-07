package unidad4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*Consideremos un vector de números enteros con índices entre 0 y n. Se define el centro del vector como el
		índice c que verifica la siguiente propiedad:
			FORMULA1
		Esta propiedad no siempre se verifica; en ese caso, decimos que el vector no tiene centro.
		Ejemplo, consideremos el siguiente vector:
			MATRIZ1
		El centro de este vector es el índice 1. En efecto, si aplicamos la definición con c = 1 y con n = 4, obtenemos
		lo siguiente:
			FORMULA2
		Por el contrario, el siguiente vector no tiene centro:
			MATRIZ2
		Crear una clase que defina dos métodos:
		• Un método llamado centro que reciba como parámetro un vector de números enteros y retorne
		el índice donde se encuentra su centro o null si no tiene centro.
		• Un método main que cree un vector de números enteros leídos por teclado y ponga a prueba el
		método anterior*/
		
		
		int tamaño;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir un vector");
			System.out.println("¿Qué tamaño tendrá el vector?");
			tamaño=teclado.nextInt();
			
			int [] vector = new int [tamaño];
			System.out.println("Vamos a rellenar su vector");
			
			for (int i = 0; i < tamaño; i++) {
				System.out.println("Dame un numero");
				vector [i]=teclado.nextInt();
			}
			
			Integer c = Centro(vector);
			
			if (c != null) {
				System.out.println("El Centro del vector es el indice " + c);
			}
			else {
				System.out.println("El vector no tiene centro");
			}
		}
	}
	
	public static Integer Centro (int[] vector) {
	
		for (int c = 1; c < vector.length -1; c++) {
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int i = 0; i < c;i++) {
				sum1 = sum1 +  (c-i) * vector[i];
			}
			for (int j = (c+1); j < vector.length;j++) {
				sum2 = sum2 + (j-c)*vector[j];
			}
			if (sum1 == sum2) {
				return c;
			}
		}
		return null;
	}
}
