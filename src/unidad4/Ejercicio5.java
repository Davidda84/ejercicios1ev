package unidad4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Programa que lea desde el teclado una línea que contenga un NIF completo (número y letra) y a
		continuación verifique que es correcto. Para obtener la letra de validación del N.I.F. se realiza la división
		entera de la parte numérica entre 23 y el resto se utiliza como índice de la tabla siguiente:
			
			TABLA
			
		La validación consiste en comprobar que la letra obtenida en la tabla coincide con la letra introducida por
		teclado.*/
		
		String dni;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Por favor, introduzca su DNI:");
			dni = teclado.next();
			char letra = dni.charAt(dni.length()-1);
			int numero = Integer.parseInt(dni.substring(0, dni.length()-1));
			int resto = numero % 23;
			
			char [] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			
			if (letra == letraDNI[resto]) {
				System.out.println("El DNI es valido");
			}
			else {
				System.out.println("El DNI no es válido");
			}
			
		}
		

	}

}
