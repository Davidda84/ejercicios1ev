package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*En el método main de una clase llamada Calculadora escribe un programa que
			funcione como una calculadora. El usuario tendrá que elegir con el teclado la
			operación que desea realizar (suma, resta, multiplicación o división) o salir del
			programa. Si elige una operación, se pedirán por teclado dos números y a
			continuación se mostrará el resultado de la operación con el formato número1
			op número2 = resultado, donde op será el símbolo que corresponda: +, -, x, /.
			Cada vez que se muestre resultado, el usuario podrá volver a elegir otra
			operación o salir.*/

		int opcion;
		String operacion = "";
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Hola soy tu calculadora");
			
			do {
				System.out.println("Elija que operación quiere ralizar:");
				System.out.println("	- 1 para Sumar dos números");
				System.out.println("	- 2 para Restar dos números");
				System.out.println("	- 3 para Multiplicar dos números");
				System.out.println("	- 4 para Dividir dos números");
				System.out.println("	- 5 para Salir");
				opcion = teclado.nextInt();
				
				switch (opcion) {

					case 1:
						operacion = "Suma";
						System.out.println("Ha elegido realizar una" + operacion + " entre dos números");
						System.out.print("Introduzca el primer número");
						num1 = teclado.nextInt();
						System.out.print("Introduzca el segundo número");
						num2 = teclado.nextInt();
						resultado = num1 + num2;
						System.out.println("----------------------------------------------------------");
						System.out.println("El resultado de la " + operacion + " entre " + num1 + " y " 
								+ num2 + " es " + resultado);
						System.out.println("----------------------------------------------------------");
						break;
						
					case 2:
						operacion = "Resta";
						System.out.println("Ha elegido realizar una" + operacion + " entre dos números");
						System.out.print("Introduzca el primer número");
						num1 = teclado.nextInt();
						System.out.print("Introduzca el segundo número");
						num2 = teclado.nextInt();
						resultado = num1 - num2;
						System.out.println("----------------------------------------------------------");
						System.out.println("El resultado de la " + operacion + " entre " + num1 + " y " 
								+ num2 + " es " + resultado);
						System.out.println("----------------------------------------------------------");
						break;
						
					case 3:
						operacion = "Multiplicación";
						System.out.println("Ha elegido realizar una" + operacion + " entre dos números");
						System.out.print("Introduzca el primer número");
						num1 = teclado.nextInt();
						System.out.print("Introduzca el segundo número");
						num2 = teclado.nextInt();
						resultado = num1 * num2;
						System.out.println("----------------------------------------------------------");
						System.out.println("El resultado de la " + operacion + " entre " + num1 + " y " 
								+ num2 + " es " + resultado);
						System.out.println("----------------------------------------------------------");
						break;
						
					case 4:
						operacion = "División";
						System.out.println("Ha elegido realizar una" + operacion + " entre dos números");
						System.out.print("Introduzca el primer número");
						num1 = teclado.nextInt();
						System.out.print("Introduzca el segundo número");
						num2 = teclado.nextInt();
						resultado = num1 / num2;
						System.out.println("----------------------------------------------------------");
						System.out.println("El resultado de la " + operacion + " entre " + num1 + " y " 
								+ num2 + " es " + resultado);
						System.out.println("----------------------------------------------------------");
						break;
				}				
			}
			while (opcion != 5 );
					System.out.print("Hasta la proxima");
		}
	}
}
