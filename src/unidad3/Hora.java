package unidad3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hora {

	public static void main(String[] args) {
		/*En el método main de una clase llamada Hora escribe un programa que lea una
			hora (horas, minutos y segundos) desde el teclado y muestre en la pantalla la
			hora correspondiente al segundo siguiente. Realiza la lectura de los datos de
			entrada como estimes oportuno.*/

		int hora;
		int min;
		int seg;
		double tiempoSegundos;
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Vamos a calcular la hora correspondiente al segundo siguiente "
					+ "de la hora que usted introduzca, siga los pasos:");
			System.out.println("Introduzca una hora entre las 0 y las 23:");
			hora = teclado.nextInt();
			System.out.println("Introduzca minutos entre 0 y 60:");
			min = teclado.nextInt();
			System.out.println("Introduzca segundos entre 0 y 60:");
			seg = teclado.nextInt();
			tiempoSegundos = hora * 3600 + min * 60 + seg+1;
			long hours = TimeUnit.SECONDS.toHours((long) tiempoSegundos);
	        long minute = TimeUnit.SECONDS.toMinutes((long) tiempoSegundos) - hours * 60;
	        long second = TimeUnit.SECONDS.toSeconds((long) tiempoSegundos) - (hours * 3600 + minute * 60);
	        if (hours == 24)
	        	hours=0;
	        System.out.println("La hora introducida es = " + hora + ":" + min + ":" + seg);
	        System.out.println("La hora calculada es = " + hours + ":" + minute + ":" + second);
		}
	}
}
		
