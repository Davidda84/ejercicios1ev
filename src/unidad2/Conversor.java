package unidad2;
import java.io.*;

public class Conversor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*En el método main de una clase Java llamada Conversor escribe un programa
			en Java que convierta de euros a dólares. El dato de entrada será un número
			decimal correspondiente a la cantidad en euros, y el dato de salida será un
			número decimal que representará la cantidad correspondiente en dólares con
			una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.*/
		
		System.out.println("Introduce una cantidad en €");
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		float euros = Float.parseFloat(teclado.readLine());
		float dolar = euros * 1.18f;
		System.out.printf("%.2f$",dolar);
		
		
	}

}
