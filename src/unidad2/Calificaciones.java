package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*En el m�todo main de una clase Java llamada Calificaciones escribe un
		programa que resuelva el problema siguiente: un estudiante desea saber cu�l
		ser� su promedio general en las tres materias que cursa y cu�l ser� el promedio
		que obtendr� en cada una de ellas. Los criterios de calificaci�n se establecen en
		la tabla siguiente:
			
			TABLA
			
		Los datos de entrada (calificaci�n del examen y calificaciones de cada una de
		las tareas realizadas) se introducir�n por teclado y los datos de salida (los
		promedios de cada asignatura y el promedio de las tres) se mostrar�n en la
		consola con una precisi�n de dos decimales. Resolver el problema sin utilizar la
		clase Scanner.*/
		
		System.out.println("Introduzca su calificaci�n en el examen de la asignatura Matem�ticas");
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		double exMat = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la primera tarea de Matem�ticas");
		double tareaM1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la segunda tarea de Matem�ticas");
		double tareaM2 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la tercera tarea de Matem�ticas");
		double tareaM3 = Double.parseDouble(teclado.readLine());
		double notaMat = exMat*0.9 + (tareaM1 + tareaM2 + tareaM3)*0.1;
		
		System.out.println("Introduzca su calificaci�n en el examen de la asignatura F�sica");
		double exFis = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la primera tarea de F�sica");
		double tareaF1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la segunda tarea de F�sica");
		double tareaF2 = Double.parseDouble(teclado.readLine());
		double notaFis = exFis*0.8 + (tareaF1 + tareaF2)*0.2;
		
		System.out.println("Introduzca su calificaci�n en el examen de la asignatura Qu�mica");
		double exQui = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la primera tarea de Qu�mica");
		double tareaQ1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la segunda tarea de Qu�mica");
		double tareaQ2 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificaci�n en la tercera tarea de Qu�mica");
		double tareaQ3 = Double.parseDouble(teclado.readLine());
		double notaQui = exQui*0.85 + (tareaQ1 + tareaQ2 + tareaQ3)*0.15;
		
		System.out.printf("Su promedio por asignatura es: Matem�ticas: %.2f; F�sica: %.2f; Qu�mica: %.2f; Promedio del curso: %.2f",notaMat,notaFis,notaQui, (notaMat+notaFis+notaQui)/3);
		

	}

}
