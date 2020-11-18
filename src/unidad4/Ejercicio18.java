package unidad4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*Crea una clase Matrices que defina los métodos de clase siguientes y ponlos a prueba en el método main
		de otra clase llamada PruebaMatrices:
		
		static int [][] cuadrada1(int dim)
		Crea una matriz cuadrada de la dimensión especificada en el parámetro dim, la rellena con los números
		enteros en el rango 1 .. dim*dim en el orden que se indica a continuación y la retorna:
		(ejemplo para una matriz cuadrada de dimensión 4) 
		
		1 5 9 13
		2 6 10 14
		3 7 11 15
		4 8 12 16
		
		static int [][] cuadrada2(int dim)
		Crea una matriz cuadrada de la dimensión especificada en el parámetro dim, la rellena con los números
		enteros en el rango 1 .. dim*dim en el orden que se indica a continuación y la retorna:
		(ejemplo para una matriz cuadrada de dimensión 4)
		
		1 8 9 16
		2 7 10 15
		3 6 11 14
		4 5 12 13
		
		static String [][] palindromos(int c, int f)
		Crea una matriz de f filas y c columnas y la rellene con palíndromos de tres letras que se generan de la
		forma siguiente:
		• La primera y tercera letra del palíndromo están determinadas el número de fila en la que se va a
		almacenar:
		fila 0 → letra ‘a’, fila 1 → letra ‘b’, fila 0 → letra ‘c’, …
		• La segunda letra del palíndromo está determinada por el valor de la suma fila+columna:
		fil+col=0 → letra ‘a’, fil+col=1 → letra ‘b’, fil+col=2 → letra ‘c’, …
		Una vez creada y rellenada, retornará la matriz.
		El número de filas y de columnas tiene que estar comprendido entre 1 y 26. De no ser así, el método
		retornará el valor null.
		(ejemplo para una matriz de 4x6)
		
		aaa aba aca ada aa aa
		bbb bcb bdb beb bfb bgb
		ccc cdc cec cfc cgc chc
		ddd ded dfd dgd dhd did
		
		static int max3x3sum(int [][] matriz)
		Recibe una matriz de NxM y retorna el valor máximo de todos los resultados que se obtienen sumando los
		elementos de cada matriz de 3x3 contenida en ella.
		El valor de N y M deber de ser mayor o igual que 3.
		(ejemplo para una matriz de dimensión 4x5)
		
		1 5 5 2 4
		2 1 4 14 3     = 75
		3 7 11 2 8
		4 8 12 16 4*/
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir matrices cuadradas");
			System.out.println("Introduce la dimensión: ");
			int dim = teclado.nextInt();
			int [][] vector = cuadrada1(dim);
			int c,f;
			System.out.println("Cuadrada 1");
			for (int i = 0; i < vector.length; i++) {
				for (int j = 0; j < vector.length; j++) {
					System.out.print(vector [i][j]);
				}
				System.out.println("");
			}
			vector = cuadrada2(dim);
			System.out.println("Cuadrada 2");
			for (int i = 0; i < vector.length; i++) {
				for (int j = 0; j < vector.length; j++) {
					System.out.print(vector [i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println("Ahora, vamos a construir una matriz de palindromos");
			System.out.println("Introduce las filas (entre 1 y 26): ");
			do {
				c = teclado.nextInt();
				if (1 > c || c > 26 ) {
					System.out.println("Las filas han de ser un número entre 1 y 26");
					System.out.println("Introduce las filas: ");
				}
			}
			while (1 > c || c > 26); 

			System.out.println("Introduce las columnas (entre 1 y 26): ");
			do {
				f = teclado.nextInt();
				if (1 > f || f > 26 ) {
					System.out.println("Las columnas han de ser un número entre 1 y 26");
					System.out.println("Introduce las columnas: ");
				}
			}
			while (1 > f || f > 26); 
			
			String [][] palindromo = palindromos(c,f);
			System.out.println("Palindromos");
			for (int i = 0; i < palindromo.length; i++) {
				for (int j = 0; j < palindromo.length; j++) {
					System.out.print(palindromo [i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
			
			System.out.println("Ahora, vamos a construir una matriz NxM");
			System.out.println("Introduce las filas (minimo 3): ");
			do {
				c = teclado.nextInt();
				if (3 > c) {
					System.out.println("Necesitamos al menos 3 filas");
					System.out.println("Introduce las filas: ");
				}
			}
			while (3 > c); 

			System.out.println("Introduce las columnas (minimo 3): ");
			do {
				f = teclado.nextInt();
				if (3 > f) {
					System.out.println("Necesitamos al menos 3 columnas");
					System.out.println("Introduce las columnas: ");
				}
			}
			while (3 > f); 
			
			int [][] vectorSuma = new int [c][f];
			
			for (int i = 0; i < c; i++) {
				System.out.println("Introduce los valores de la fila " + (i+1) + " separados por espacios");
				for (int j = 0; j < f; j++) {
					
					vectorSuma[i][j] = teclado.nextInt();					
				}
			}
			
			System.out.println("max3x3sum");
			for (int i = 0; i < vectorSuma.length; i++) {
				for (int j = 0; j < vectorSuma[i].length; j++) {
					System.out.print(vectorSuma [i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println(max3x3sum(vectorSuma));
		}
	}
	
	static int [][] cuadrada1(int dim){
		int [][] vector = new int [dim][dim];
		int k = 1;
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				vector[j][i] = k;
				k++;
			}
		}
		return vector;
	}
	
	static int [][] cuadrada2(int dim){
		int [][] vector = new int [dim][dim];
		int k = 1;
		for (int i = 0; i < dim; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < dim; j++) {
					vector[j][i] = k;
					k++;
				}
			}
			else {
				for (int j = dim - 1; j > -1; j--) {
					vector[j][i] = k;
					k++;
				}
			}
			
		}
		return vector;
	}
	
	static String [][] palindromos(int c, int f){
		String [][] vector = new String [c][f];
		char letra1 = 'a';
		
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				char letra2 = (char) (letra1 + j);
				StringBuilder sb = new StringBuilder();
				sb.append(letra1);
				sb.append(letra2);
				sb.append(letra1);
				vector[i][j] = sb.toString();
				letra2++;
			}
			letra1++;
		}
		return vector;
	}
	
	static int max3x3sum(int [][] matriz) {
		int max = 0;
		for (int i = 0; i < matriz.length-2; i++ ) {
			for (int j = 0; j < matriz[i].length-2; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						sum += matriz[i+k][j+l];
					}
				}
				if (sum > max) {
					max = sum;
				}
			}
			
		}
		return max;
	}
	

}
