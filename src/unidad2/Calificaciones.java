package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*En el método main de una clase Java llamada Calificaciones escribe un
		programa que resuelva el problema siguiente: un estudiante desea saber cuál
		será su promedio general en las tres materias que cursa y cuál será el promedio
		que obtendrá en cada una de ellas. Los criterios de calificación se establecen en
		la tabla siguiente:
			
			TABLA
			
		Los datos de entrada (calificación del examen y calificaciones de cada una de
		las tareas realizadas) se introducirán por teclado y los datos de salida (los
		promedios de cada asignatura y el promedio de las tres) se mostrarán en la
		consola con una precisión de dos decimales. Resolver el problema sin utilizar la
		clase Scanner.*/
		
		System.out.println("Introduzca su calificación en el examen de la asignatura Matemáticas");
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		double exMat = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la primera tarea de Matemáticas");
		double tareaM1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la segunda tarea de Matemáticas");
		double tareaM2 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la tercera tarea de Matemáticas");
		double tareaM3 = Double.parseDouble(teclado.readLine());
		double notaMat = exMat*0.9 + (tareaM1 + tareaM2 + tareaM3)*0.1;
		
		System.out.println("Introduzca su calificación en el examen de la asignatura Física");
		double exFis = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la primera tarea de Física");
		double tareaF1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la segunda tarea de Física");
		double tareaF2 = Double.parseDouble(teclado.readLine());
		double notaFis = exFis*0.8 + (tareaF1 + tareaF2)*0.2;
		
		System.out.println("Introduzca su calificación en el examen de la asignatura Química");
		double exQui = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la primera tarea de Química");
		double tareaQ1 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la segunda tarea de Química");
		double tareaQ2 = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca su calificación en la tercera tarea de Química");
		double tareaQ3 = Double.parseDouble(teclado.readLine());
		double notaQui = exQui*0.85 + (tareaQ1 + tareaQ2 + tareaQ3)*0.15;
		
		System.out.printf("Su promedio por asignatura es: Matemáticas: %.2f; Física: %.2f; Química: %.2f; Promedio del curso: %.2f",notaMat,notaFis,notaQui, (notaMat+notaFis+notaQui)/3);
		

	}

}
