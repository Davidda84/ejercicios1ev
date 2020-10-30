package unidad3;

import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		
		int min;
		int max;
		int fallos = 0;
		String respuesta;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, ¿Puedo adivinar un número en el que estés pensando?");
			System.out.println("Establezcamos los limites");
			System.out.println("Dime el limite inferior: ");
			min = teclado.nextInt();
			System.out.println("Ahora, dime el limite superior: ");
			do {
				max = teclado.nextInt();
				if (max < min) {
					System.out.println("El limite superior ha de ser mayor que el inferior. Introduce un valor correcto");
				}
				
			}
			while (max < min);
			
			System.out.println("De acuerdo voy a adivinar el numero entre " + min + " y " + max + " en el que estas pensando");
			int numero = (int) Math.floor(Math.random()*(max-min+1)+min);
			System.out.println("¿Estás pensando en el número " + numero + "? ¿Es Correcto, mayor o menor?");
			respuesta = teclado.next();
						
			do {
				if (respuesta.equalsIgnoreCase ("mayor")) {
					fallos = fallos + 1;
					min = numero;
					System.out.println("Vaya he fallado, pero ahora se que el numero que busco esta entre " + min + " y " + max);
					System.out.println("Lo intentaré de nuevo");
					numero = (int) Math.floor(Math.random()*(max-min+1)+min);
					System.out.println("¿Estás pensando en el número " + numero + "? ¿Es Correcto, mayor o menor?");
				}
				else if (respuesta.equalsIgnoreCase ("menor")){
					fallos = fallos + 1;
					max = numero;
					System.out.println("Vaya he fallado, pero ahora se que el numero que busco esta entre " + min + " y " + max);
					System.out.println("Lo intentaré de nuevo");
					numero = (int) Math.floor(Math.random()*(max-min+1)+min);
					System.out.println("¿Estás pensando en el número " + numero + "? ¿Es Correcto, mayor o menor?");
				}
				respuesta = teclado.next();
			}
			while(respuesta.equalsIgnoreCase ("mayor") || respuesta.equalsIgnoreCase ("menor"));
			
			if (fallos < 1) {
				System.out.println("¡¡¡¡Soy un fiera!!!!");
			}
			else {
				System.out.println("¡¡¡¡Genial!!!!");
				System.out.println("Solo he tenido " + fallos + " fallos");
			}

		}

	}
}