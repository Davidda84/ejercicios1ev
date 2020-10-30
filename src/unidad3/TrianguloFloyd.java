package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
			/*En el método main de una clase llamada TrianguloFloyd escribe un programa
				que genere él triangulo de Floyd para un número de filas que introduciremos
				por teclado y lo muestre por pantalla. Por ejemplo, si el número de filas es 4 el
				triángulo de Floyd será:
				1
				2 3
				4 5 6
				7 8 9 10*/
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola vamosa generar un triángulo de FLoyd.");
			System.out.println("Introduzca el número de filas que desees");
			int nFilas= teclado.nextInt();
			int numero=0;
			
			while(nFilas<=0){
				
				System.out.println("Error!!!");
				System.out.println("El número ha de ser mayor que cero");
				System.out.println("Introduzca el número de filas que desees");
				nFilas=teclado.nextInt();
			}
			
			for (int i=1;i<=nFilas;i++) {
				 
				for(int j=1;j<=i;j++) {
					numero++;
					System.out.print(numero+" ");
					
				}
				System.out.println("");
			}
		}
	}

}
