package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int numero;
		int solucion = (int) Math.floor(Math.random()*(100000-1000+1)+1000);
		int fallos = 0;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("¿Puedes adivinar en que número estoy pensando?");
			System.out.println("Pista: Se encuentra entre 1000 y 100.000");
			do {
				numero = teclado.nextInt();
				if (numero > solucion) {
					fallos = fallos + 1;
					System.out.println("Has fallado, " + numero + " es mayor que el número que buscas");
					System.out.println("Intentalo otra vez, ¿en que número estoy pensando?");
				}
				else if (numero < solucion){
					fallos = fallos + 1;
					System.out.println("Has fallado, " + numero + " es menor que el número que buscas");
					System.out.println("Intentalo otra vez, ¿en que número estoy pensando?");
				}
			}
			while(numero != solucion);
			
			if (fallos < 1) {
				System.out.println("¡¡¡¡Enhorabuena, has acertado a la primera!!!!");
			}
			else {
				System.out.println("¡¡¡¡Enhorabuena, has acertado!!!!");
				System.out.println("Has tenido " + fallos + " fallos");
			}

		}

	}
}
