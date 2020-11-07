package unidad4;

import java.util.Random;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Programa que cree una matriz de números enteros aleatorios con un número de filas y de columnas
		aleatorios que estén comprendidos entre 2 y 20.
		Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga la suma de
		los valores de cada fila.
		Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga la suma
		de los valores de cada columna.
		Mostrar en la consola la matriz, la suma de las filas a su derecha y la suma de las columnas en la parte
		inferior.*/
		
		Random valor = new Random();
		int fil = (int) Math.floor(Math.random()*19)+2;
		int col = (int) Math.floor(Math.random()*19)+2;
		int [][] vector = new int [fil][col];
		
		for (int i=0; i < fil; i++) {
			for(int j=0; j < col; j++) {
				vector[i][j] = valor.nextInt();
			}
		}
		
		int [] sumaf = Sumafilas(vector);
		int [] sumac = SumaCol(vector);

		for (int w = 0; w < vector.length; w++) {
			System.out.print("|");
			 for (int q = 0; q < vector[w].length; q++) {
				   System.out.print (vector[w][q] + " | " );   
			   }
			 System.out.println("Suma de la fila -> " + sumaf[w]);
		}
		System.out.println("---------------------------Suma Columnas----------------------------------------");
		System.out.print("|");
		for (int r = 0; r < vector[0].length; r++) {
				   System.out.print (sumac[r] + " | " );   
		}
	}
	
	public static int[] Sumafilas (int[][] vector) {
		
		int [] sumaFil = new int [vector.length];
		
		for (int f = 0; f < vector.length; f++) {
			   for (int c = 0; c < vector[f].length; c++) {
				   sumaFil [f]+= vector[f][c];
			   }
		}
		return sumaFil; 
	}
	public static int[] SumaCol (int[][] vector) {
		
		int [] sumaCol = new int [vector[0].length];
		
		for (int a = 0; a < vector[0].length; a++) {
			   for (int b = 0; b < vector.length; b++) {
				   sumaCol [a]+= vector[b][a];
			   }
		}
		return sumaCol; 
	}
}
