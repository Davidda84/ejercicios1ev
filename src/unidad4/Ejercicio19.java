package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws IOException {
		/*Definir un método rellenar que declare los parámetros formales siguientes:
			• Matriz de caracteres en la que se almacenan letras minúsculas y dígitos numéricos (a-z, 0-9).
			• Un índice de fila al que llamaremos filaInicial.
			• Un índice de columna al que llamaremos columnaInicial.
			• Un carácter de relleno al que llamaremos caracterRelleno.
			El método tendrá que realizar la tarea siguiente:
			Comenzando en la posición [filaInicial][columnaInicial] de la matriz, donde se encuentra el
			carácter que llamaremos caracterInicial, se sustituirá por el caracterRelleno todo carácter de la
			matriz que cumpla las condiciones siguientes:
			• Es igual a caracterInicial.
			• Se puede llegar a él desde la posición [filaInicial][columnaInicial] con movimientos
			simples del tipo:
			o desplazarse 1 fila arriba
			o desplazarse 1 fila abajo
			o desplazarse 1 columna a la izquierda
			o desplazarse 1 columna a la derecha
			atravesando únicamente celdas que contengan el caracterInicial.
			En definitiva, se trata de realizar algo similar a lo que hacen algunos programas de dibujo cuando utilizamos
			la herramienta de relleno, pero en lugar de rellenar con un color una región de un bitmap, rellenamos con
			un carácter una región de una matriz.
			Para poner a prueba el método se ha de crear un programa que lea de la entrada estándar los datos
			necesarios para crear la matriz de caracteres original y los parámetros de relleno según las especificaciones
			siguientes:
			• En la primera línea el usuario escribirá dos números enteros, F y C, que representarán el número de
			filas y de columnas de la matriz.
			• En cada una de las siguientes F líneas introducirá una cadena de longitud C que contendrá los
			caracteres que se guardaran en cada una de las F filas de la matriz respectivamente.
			• En la línea siguiente introducirá el carácter de relleno.
			• En las dos últimas filas introducirá el valor para los índices de fila y columna de la posición inicial
			dentro de la matriz a partir de la cual se ha de realizar el relleno.
			Una vez leídos los datos de entrada y creada la matriz, la mostrará por pantalla, invocará al método de
			relleno con los parámetros correspondientes y finalmente volverá a mostrar la matriz para ver el resultado
			del relleno*/
		int c;
		int f;
		String relleno = "";
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola, vamos a construir una matriz");
			System.out.println("¿Cuantas filas tendrá la matriz?");
			f = teclado.nextInt();
			teclado.nextLine();
			System.out.println("¿Cuantas columnas tendrá la matriz?");
			c = teclado.nextInt();
			teclado.nextLine();
			System.out.println("De acuerdo ahora vamos a rellanar la matriz de " + f + " filas y " +
					c + " columnas");
			char [][] matriz = GeneraMatriz(f,c);
			System.out.println("Esta es tu matriz");
			for (int i = 0; i < matriz.length;i++) {
				for(int j = 0; j < matriz[i].length;j++) {
					System.out.print(matriz[i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println("Por favor indica la fila donde quieres iniciar el relleno");
			int filaInicial = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Por favor indica la columna donde quieres iniciar el relleno");
			int columnaInicial = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Por favor indica el caracter de relleno");
			do {
				relleno = teclado.nextLine();
				relleno = relleno.toLowerCase();
				if (relleno.length() != 1) {
					System.out.println("Has introducido " + relleno.length() + " caracteres");
					System.out.println("Introduce solo UN caracter alfanumerico (a-z)(0-9)");
				}
			}
			while (relleno.length() != 1);
			System.out.println("Has decidido rellenar tu matriz en la fila " + filaInicial + " columna " + 
					columnaInicial + " con el caracter " + relleno);
			System.out.println("Esta es tu matriz tras aplicar el relleno");
			char [][] matrizRellenada = Rellenar(filaInicial,columnaInicial,relleno,matriz);
			for (int i = 0; i < matrizRellenada.length;i++) {
				for(int j = 0; j < matrizRellenada[i].length;j++) {
					System.out.print(matrizRellenada[i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
	}
	static char [][] GeneraMatriz(int f, int c) throws IOException{
		char [][] matriz = new char [f][c];
		String contenidoFila="";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < f ; i++) {
			System.out.println("Vamos a rellenar la fila " + (i+1) + 
					" introduce " + c + " caracteres alfanumericos (a-z)(0-9)");
				do {
					contenidoFila = reader.readLine();
					if (contenidoFila.length() != c) {
						System.out.println("La fila ha de estar compuesta de " + c + " caracteres");
						System.out.println("Introduce " + c + " caracteres alfanumericos (a-z)(0-9)");
					}
					else {
						contenidoFila = contenidoFila.toLowerCase();
						for (int j = 0; j < c; j++) {
							matriz[i][j] = contenidoFila.charAt(j);
						}
					}
				}
				while (contenidoFila.length() != c);
			}
		return matriz;
	}
	
	static char [][] Rellenar(int f, int c, String r, char[][] matriz) throws IOException{
		char [][] matrizRellenada = matriz;
		char caracterinicial = matriz[f][c];
		String caracterRelleno = r;
		matrizRellenada [f][c] = caracterRelleno.charAt(0);
		int filaMenos = f-1;
		if(filaMenos >= 0) {
			if (matrizRellenada [filaMenos][c] == caracterinicial) {
				matrizRellenada = Rellenar(filaMenos,c,caracterRelleno,matrizRellenada);
			}
			
		}
		int filaMas = f+1;
		if(filaMas < matrizRellenada.length) {
			if (matrizRellenada [filaMas][c] == caracterinicial) {
				matrizRellenada = Rellenar(filaMas,c,caracterRelleno,matrizRellenada);
			}
			
		}
		int colMenos = c-1;
		if(colMenos >= 0) {
			if (matrizRellenada [f][colMenos] == caracterinicial) {
				matrizRellenada = Rellenar(f,colMenos,caracterRelleno,matrizRellenada);
			}
			
		}
		int colMas = c+1;
		if(colMas < matrizRellenada[0].length) {
			if (matrizRellenada [f][colMas] == caracterinicial) {
				matrizRellenada = Rellenar(f,colMas,caracterRelleno,matrizRellenada);
			}
			
		}
		return matrizRellenada;
	}

}
