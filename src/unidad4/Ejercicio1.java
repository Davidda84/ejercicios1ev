package unidad4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Programa que lea una cadena desde el teclado y muestre en la consola el número de veces que se repite
			cada vocal.*/
		
		String cadena;
		char [] arrayCadena;
		char vocales [] = new char[5];
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		int contador = 0;
		int vocal = 0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca una cadena de caracteres: ");
			cadena=teclado.nextLine();
			arrayCadena = cadena.toCharArray();
			
			for(int i = 0; i < vocales.length; i++){
		        for (int l = 0; l < arrayCadena.length; l++){
		        		if(arrayCadena[l] == vocales[i]){
		        			contador = contador + 1;
		        		}
		        }
		        System.out.println("La " + vocales[i] + " se repite " + contador + " veces" );
		        vocal = vocal + contador;
		        contador = 0;
		    }
			System.out.println("Hay " + vocal + " vocales." );
		}
	}

}
