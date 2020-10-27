package unidad3;

import java.time.LocalDate;
import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		/*En el método main de una clase llamada Bisiesto escribe un programa que
			utilizando una única expresión lógica determine si un año es o no es bisiesto. El
			año se introducirá por teclado y el resultado lo mostrará en la pantalla. Un año
			es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo
			si son múltiplos de 400.*/
		
		int año;
		String tiempo;
		LocalDate date = LocalDate.now();
		int year  = date.getYear();
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduzca un año");
			año = teclado.nextInt();
			
			if (año < year)
				tiempo = " fue";
			else if (año == year)
				tiempo = " es";
			else
				tiempo = " será";
			
			if (año%4==0)
				if (año%100!=0)
					System.out.println("El año " + año + tiempo +" Bisiesto");
				else if(año%400==0)
					System.out.println("El año " + año + tiempo +" Bisiesto");
				else
					System.out.println("El año " + año + " no" + tiempo +" Bisiesto");
			else
				System.out.println("El año " + año + " no" + tiempo + " Bisiesto");
		}

	}

}
