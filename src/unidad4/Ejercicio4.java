package unidad4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*Programa que, utilizando una cantidad mínima de variables, simule el lanzamiento de un dado N veces,
		siendo N un número entero que se introducirá por teclado. Antes de finalizar mostrará el número de veces
		que salió cada una de las caras.*/
		
		int veces;
		int contador;
		int resultados[] = new int[6];
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, ¿Cuantas veces quieres lanzar el dado?");
			veces=teclado.nextInt();
			
			for (contador = 1; contador <= veces; contador++) {
				resultados[(int) Math.floor(Math.random()*6)]++;
			}
			
			System.out.println("He lanzado un dado " + veces + " veces");
			System.out.println("El uno ha salido " + resultados[0] + " veces" );
			System.out.println("El dos ha salido " + resultados[1] + " veces" );
			System.out.println("El tres ha salido " + resultados[2] + " veces" );
			System.out.println("El cuatro ha salido " + resultados[3] + " veces" );
			System.out.println("El cinco ha salido " + resultados[4] + " veces" );
			System.out.println("El seis ha salido " + resultados[5] + " veces" );
		}

	}

}
