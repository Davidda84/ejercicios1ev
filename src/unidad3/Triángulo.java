package unidad3;

import java.util.Scanner;

public class Triángulo {

	public static void main(String[] args) {
		/*En el método main de una clase llamada Triángulo escribe un programa que
			determine si tres números reales que se introducen por teclado pueden ser las
			longitudes de los lados de un triángulo. Si la respuesta es afirmativa, tendrá que
			responder a las preguntas siguientes:
				• ¿Es escaleno?
				• ¿Es equilátero?
				• ¿Es isósceles?*/
		
		double lado1;
		double lado2;
		double lado3;

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca las longitudes de los lados de un triangulo, "
					+ "por favor sigá las instrucciones:");
			System.out.println("Introduzca la longitud del primer lado");
			lado1 = teclado.nextInt();
			System.out.println("Introduzca la longitud del segundo lado");
			lado2 = teclado.nextInt();
			System.out.println("Introduzca la longitud del tercer lado");
			lado3 = teclado.nextInt();
		}
		
		if (lado1 == lado2 && lado1 == lado3)
			System.out.println("El triángulo es equilátero");
		else if (lado1 == lado2 || lado1 == lado2 || lado2 == lado3)
			System.out.println("El triángulo es isósceles");
		else
			System.out.println("El triángulo es escaleno");			
	}
}
