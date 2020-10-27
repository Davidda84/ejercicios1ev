package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
									
		/*En el método main de una clase llamada Multiplicar escribe un programa que
																					   
			ayude al aprendizaje de las tablas de multiplicar. El programa preguntará qué
			tabla se desea repasar (número entre 1 y 9). A continuación, preguntará el
			resultado de cada multiplicación de la tabla elegida, contabilizando cada fallo y
			mostrando la respuesta correcta. Al completar la tabla, el programa le dirá al
			usuario si ha aprobado (menos de 2 fallos) o ha suspendido (2 o más fallos).
			Después finalizar el repaso de cada tabla, se dará la opción de repasar otra o
			salir del programa.*/
		
		int tabla;
		int respuesta;
		int resultado;
		int aciertos;
		int fallos;
		char salida;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Vamos a repasar las tablas de multiplicar");

			do {
				System.out.println("Elija que tabla quiere repasar (del 1 al 9):");
				tabla = teclado.nextInt();
				
				  

				while (tabla < 1 || tabla > 9) {
					System.out.println("Error, solo puede repasar las tablas del 1 al 9");
					tabla = teclado.nextInt();
				}
				
				System.out.println("De acuerdo, comenzemos a repasar la tabla del " + tabla);
				aciertos = 0;
				fallos = 0;
					
				for (int i = 1; i <= 10; i++) {
	  

	 
					 
					System.out.println("Calcula " + tabla + " X " + i + ":");
					respuesta = teclado.nextInt();
					resultado = tabla * i;
					
					if(respuesta == resultado)
						aciertos = aciertos + 1;
					else
						fallos = fallos + 1;
				}
				
				System.out.println("Estos son sus resultados:");
				System.out.println("Aciertos = " + aciertos);
				System.out.println("Fallos = " + fallos);
				
				if (fallos >= 2)
					System.out.println("SUSPENSO");
				else
					System.out.println("APROBADO");
				
				System.out.print("¿Quiere repetir(r) o quiere salir(s)?");
				salida = teclado.next().charAt(0);
			}
			while (salida == 'r');

		}

	}
}
