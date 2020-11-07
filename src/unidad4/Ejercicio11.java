package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*Definir un método que reciba un vector de cadenas y retorne la cadena de mayor longitud almacenada en
		dicho vector.
		Poner a prueba el método invocándolo desde otro método que cree un vector con los nombres de 10
		personas introducidos por teclado.*/
		
		int contadorNombres = 1;
		String [] vector = new String [10];
		
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, por favor introduzca el numero de 10 personas");
			
			do {
				System.out.println("Introduzca el " + contadorNombres + "º nombre");
				vector [contadorNombres-1]=teclado.nextLine();
				
				contadorNombres++;
			}
			while (contadorNombres < 11);
			String maxLongitud = LongMax(vector);
			System.out.println("El nombre más largo es: " + maxLongitud);
		}
	}
	
	public static String LongMax (String[] cadena) {
		
		int longitudMax = 0;
		int j = 0;
		String maxString;
		for (int i = 0; i < cadena.length; i++) {
			if (i > 1) {
				if (longitudMax < cadena[i].length()) {
					longitudMax = cadena[i].length();
					j = i;
				}
			}
			else {
				longitudMax = cadena[i].length();
				j = i;
			}
		}
		maxString = cadena[j];
		return maxString;
	}
}
