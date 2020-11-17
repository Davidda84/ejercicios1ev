package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*Crear una clase llamada MétodosOrdenación que defina tres métodos estáticos para ordenar vectores
		de números enteros implementando la ordenación por inserción directa, por selección directa y por
		intercambio directo respectivamente.*/
		
		Random n = new Random();
		int fil = (int) Math.floor(Math.random()*11);
		int [] vector = new int [fil];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = n.nextInt();
		}
		System.out.println("Vector Original: " + Arrays.toString(vector));
		System.out.println("Vector Inserción Directa: " + Arrays.toString(InDirecta(vector)));
		System.out.println("Vector Selección Directa: " + Arrays.toString(SelDirecta(vector)));
		System.out.println("Vector Selección Directa: " + Arrays.toString(InterDirecto(vector)));
	}
		
	public static int [] InDirecta(int vector[]){                                            
	    int l, j;
	    int k;
	    for (j = 1; j < vector.length; j++){ 
	              k = vector[j];
	              l = j - 1;
	              while ((l >= 0) && (k < vector[l])){

	            	  vector[l + 1] = vector[l];   
	                             l--;
	              }
	              vector[l + 1] = k;
	    }
	    return vector;
	}
	
	public static int [] SelDirecta(int vector[]) {
        int m, p, tmp;
        for (int i = 0; i < vector.length - 1; i++) {
              m = vector[i];                   
              p = i;
              for (int j = i + 1; j < vector.length; j++){
                    if (vector[j] < m) {
                        m = vector[j];
                        p = j;
                    }
              }
              if (p != i){                         
                  tmp = vector[i];
                  vector[i] = vector[p];
                  vector[p] = tmp;
              }
        }
        return vector;
	}
	
	public static int [] InterDirecto(int [] vector){
        int i, j, aux;
        for(i = 0; i < vector.length - 1; i++) {
             for(j = 0; j < vector.length-i - 1; j++) {
                  if(vector[j+1] < vector[j]){
                     aux = vector[j+1];
                     vector[j+1] = vector[j];
                     vector[j] = aux;
                  }
             }
        }
        return vector;
	}
	
}
		


