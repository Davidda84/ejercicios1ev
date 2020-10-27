package unidad2;

import java.util.Scanner;

public class ColorRGB {

	public static void main(String[] args) {
		/*En el método main de una clase Java llamada Sueldo escribe un programa que
			permita convertir las componentes de un color en el espacio RGB en sus
			componentes en el espacio YIQ, según las expresiones matemáticas siguientes:
				y=0,299r+0,587 g+0,114 b
				i=0,596 r−0,275 g−0,321b
				q=0,212 r−0,528 g+0,311b
			Se le pedirá al usuario que introduzca por teclado las componentes rgb (rojo,
			verde y azul).*/

		try (Scanner teclado = new Scanner(System.in)) {
			double rojo;
			double verde;
			double azul;
			double y;
			double i;
			double q;
			
			System.out.println("Vamos a convertir el codigo de color RGB a YIQ, sigua las instrucciones:");
			System.out.println("Introduzca el valor RGB para el Rojo:");
			rojo = teclado.nextDouble();
			System.out.println("Introduzca el valor RGB para el Verde:");
			verde = teclado.nextDouble();
			System.out.println("Introduzca el valor RGB para el Azul:");
			azul = teclado.nextDouble();
			y = 0.299 * rojo + 0.587 * verde + 0.114 * azul;
			i = 0.596 * rojo - 0.275 * verde - 0.321 * azul;
			q = 0.212 * rojo - 0.528 * verde + 0.311 * azul;
			System.out.printf("El codigo YIQ será:  Y = %.3f I = %.3f Q = %.3f",y,i,q);
		}

	}

}
