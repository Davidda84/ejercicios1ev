package unidad2;
import java.io.*;

public class Conversor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*En el m�todo main de una clase Java llamada Conversor escribe un programa
		en Java que convierta de euros a d�lares. El dato de entrada ser� un n�mero
		decimal correspondiente a la cantidad en euros, y el dato de salida ser� un
		n�mero decimal que representar� la cantidad correspondiente en d�lares con
		una precisi�n de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.*/
		
		System.out.println("Introduce una cantidad en �");
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		float euros = Float.parseFloat(teclado.readLine());
		float dolar = euros * 1.18f;
		System.out.printf("%.2f$",dolar);
		
		
	}

}
