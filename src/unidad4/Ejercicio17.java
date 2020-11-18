package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*Programa que cree dos vectores de números enteros, cada uno de ellos de una longitud aleatoria entre 10
		y 100, los rellene con valores aleatorios, los ordene, los mezcle en un tercer vector manteniendo la
		ordenación y finalmente muestre el contenido de los tres vectores.*/
		
		Random n = new Random();
		int fil1 = (int) Math.floor((Math.random()*91)+10);
		int [] vector1 = new int [fil1];
		int fil2 = (int) Math.floor((Math.random()*91)+10);
		int [] vector2 = new int [fil2];
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = n.nextInt();
		}
		vector1 = InterDirecto (vector1);
		for (int j = 0; j < vector2.length; j++) {
			vector2[j] = n.nextInt();
		}
		vector2 = InterDirecto (vector2);
		int [] vector3 = new int [(fil1+fil2)];
		System.arraycopy(vector1, 0, vector3, 0, fil1);
        System.arraycopy(vector2, 0, vector3, fil1, fil2);
        System.out.println("Vector 1: " + Arrays.toString(vector1));
		System.out.println("Vector 2: " + Arrays.toString(vector2));
		System.out.println("Vector 3: " + Arrays.toString(RellenaV3(vector1, vector2)));
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
	
	public static int [] RellenaV3(int [] vector1, int [] vector2){
		int[] v1 = vector1;
		int[] v2 = vector2;
		int [] vector3 = new int [(v1.length+v2.length)];
		int j = 0;
		int k = 0;
		for(int i = 0; i < (v1.length+v2.length); i++){
	    	if(j < v1.length && k < v2.length) {
	    	   if(v1[j] <= v2[k]){
	    		vector3[i] = v1[j];
	    		j++;
	    	   }
	    	   else{
				vector3[i] = v2[k];
				k++;
	    	   }
	    	}else if(k == v2.length) {
	    		   vector3[i] = v1[j];
	    		   i++;
	    	}else {
	    			vector3[i] = v2[k];
	    			k++;
	    	}
		}
		return vector3;
	}

}
