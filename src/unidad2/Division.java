package unidad2;

public class Division {

	public static void main(String[] args) {
		/*En el método main de una clase Java llamada Division escribe un programa
			que muestre en la consola la división de 1234 entre 532 siendo ambos números
			reales. El formato de salida será un número que ocupará un mínimo de 15
			caracteres en pantalla, de los cuales dos se utilizarán para la parte decimal.*/
		
		double num1 = 1234;
		double num2 = 532;
		System.out.printf("La división entre " + num1 + " y " + num2 + " es %13.2f",num1/num2);

	}

}
