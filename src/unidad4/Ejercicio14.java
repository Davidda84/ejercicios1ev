package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*Programa que utilice un único array para leer y almacenar los datos de varias secuencias de números
		enteros. Los datos se introducirán por teclado de la forma siguiente:
		• Se escribe una primera línea que contiene el número de secuencias.
		• A continuación, se escriben las secuencias a razón de dos líneas por secuencia con el formato
		siguiente:
		o La primera contiene la cantidad de números de la secuencia.
		o La segunda contiene los números de la secuencia separados por espacios*/
		
		int tSec;
		int nSec;
		int num;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, por favor introduzca el numero de secuencias que desea introducir");
			tSec = teclado.nextInt();

			String [] array = new String [tSec];

			System.out.println("Por último, idique cada secuencia de números separados por espacios");
			
			for (int i = 0; i < tSec;i++) {
				
				System.out.println("Indique cuantos números tendrá la secuencia número " +(i+1));
				
				nSec = teclado.nextInt();
				
				int [] secuencia = new int [nSec];
				
				System.out.println("Introduzca la secuencia nº " + (i+1));
				
				for (int j = 0; j < nSec; j++) {
					num = teclado.nextInt();
					secuencia [j] = num;
				}
				
				array [i] = Arrays.toString(secuencia);
			}
			
			System.out.println(Arrays.toString(array));
			
		}
	}
}
