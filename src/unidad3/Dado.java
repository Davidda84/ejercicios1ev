package unidad3;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		/*En el método main de una clase llamada Dado escribe un programa que simule
		el lanzamiento de un dado N veces, siendo N un número entero que se
		introducirá por teclado. El programa finalizará mostrando en la pantalla cuantas
		veces salió cada una de las caras.*/
		
		int veces;
		int contador = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, ¿Cuantas veces quieres lanzar el dado?");
			veces=teclado.nextInt();
			do {
				contador++;
				int numero = (int) Math.floor(Math.random()*6)+1;
				switch (numero) {
					case 1:
						n1++;
						break;
					case 2:
						n2++;
						break;
					case 3:
						n3++;
						break;
					case 4:
						n4++;
						break;
					case 5:
						n5++;
						break;
					case 6:
						n6++;
						break;
				}
			}
			while (contador != veces);
			System.out.println("He lanzado un dado " + veces + " veces");
			System.out.println("El uno ha salido " + n1 + " veces" );
			System.out.println("El dos ha salido " + n2 + " veces" );
			System.out.println("El tres ha salido " + n3 + " veces" );
			System.out.println("El cuatro ha salido " + n4 + " veces" );
			System.out.println("El cinco ha salido " + n5 + " veces" );
			System.out.println("El seis ha salido " + n6 + " veces" );
		}

	}

}
