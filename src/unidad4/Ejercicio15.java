package unidad4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*Programa para la gestión de las calificaciones de los alumnos en las tres evaluaciones de una asignatura. El
		programa deberá pedir al profesor que introduzca por teclado los nombres de cada alumno junto a las
		calificaciones de cada evaluación. Después le permitirá realizar las acciones siguientes a través del menú
		correspondiente:
		1. Mostrar la nota media de todos los alumnos.
		2. Mostrar la nota media de un alumno determinado.
		3. Visualizar las notas por evaluación y la nota final de cada evaluación.
		4. Visualizar las notas por evaluación y la nota final de un alumno determinado.
		5. Calcular la nota media del curso.
		6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.
		7. Salir.
		Almacenar los datos en las estructuras de datos estáticas que se consideren necesarias, además de
		proporcionar una solución basada en la técnica de programación modular.*/
		
		int nAlum;
		String nomAlum;
		int opcion;
		int alumSel;
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			System.out.println("Programa para la gestión de las calificaciones de los alumnos");
			System.out.println("Introduzca el número de alumnos");
			
			nAlum = teclado.nextInt();
			teclado.nextLine();
			
			String [] alumnos = new String [nAlum];
			double [][] calificaciones = new double [nAlum][4];
			
			for ( int i = 0; i < nAlum; i++) {
				System.out.println("Introduzca el nombre del alumno número " + (i+1));
				nomAlum = teclado.nextLine();
				
				alumnos[i] = nomAlum;
				System.out.println("Introduzca las notas del alumno número " + (i+1) 
						+ " , separando cada evaluación con espacios ");

					for (int j = 0; j < 3; j++) {
						calificaciones[i][j] = teclado.nextInt();
					}
					
					calificaciones[i][3] = (calificaciones[i][0]+calificaciones[i][1]+calificaciones[i][2])/3;
					teclado.nextLine();
			}
			
			do {
				do {
					System.out.println("Eliga una opción:\r\n" +
							"1. Mostrar la nota media de todos los alumnos.\r\n" + 
							"2. Mostrar la nota media de un alumno determinado.\r\n" + 
							"3. Visualizar las notas por evaluación y la nota final de cada evaluación.\r\n" + 
							"4. Visualizar las notas por evaluación y la nota final de un alumno determinado.\r\n" + 
							"5. Calcular la nota media del curso.\r\n" + 
							"6. Calcular la nota más alta y la más baja e indicar a qué alumno y "
							+ "evaluación pertenece.\r\n" + 
							"7. Salir.");
				
					opcion = teclado.nextInt();
					if (opcion < 1 || opcion > 7 ) {
						System.out.println("Por favor, ciñase a las opciones dadas");
					}
				}
				while (opcion < 1 || opcion > 7 ); 
				
				if (opcion !=7) {
					System.out.println("-------------------------------------------------------------------------");
				}
				switch (opcion) {
			
				case 1:
					for (int j = 0; j < alumnos.length; j++) {
						System.out.println("La nota media de " + alumnos[j] + ": " + calificaciones[j][3]);
					}
					break;
				
				case 2:
					System.out.println("Seleccione el alumno: ");
					for (int j = 0; j < alumnos.length; j++) {
						System.out.println((j+1) + ". " + alumnos[j]);
					}
					alumSel = teclado.nextInt();
					System.out.println("El alumno " + alumnos[alumSel-1] + 
							" tiene de nota media " + calificaciones[alumSel-1][3]);
					break;
			
				case 3:
					for (int j = 0; j < alumnos.length; j++) {
						System.out.println(alumnos[j] + ": \r\n" + 
								"Nota evaluación 1: "+ calificaciones[j][0] + "\r\n" +
								"Nota evaluación 2: "+ calificaciones[j][1] + "\r\n" +
								"Nota evaluación 3: "+ calificaciones[j][2] + "\r\n" +
								"Nota final"+ calificaciones[j][3]);
					}
					break;
				
				case 4:
					System.out.println("Seleccione el alumno: ");
					for (int j = 0; j < alumnos.length; j++) {
						System.out.println((j+1) + ". " + alumnos[j]);
					}
					alumSel = teclado.nextInt();
					System.out.println("El alumno " + alumnos[alumSel-1] + 
							"Nota evaluación 1: "+ calificaciones[alumSel-1][0] + "\r\n" +
							"Nota evaluación 2: "+ calificaciones[alumSel-1][1] + "\r\n" +
							"Nota evaluación 3: "+ calificaciones[alumSel-1][2] + "\r\n" +
							"Nota final"+ calificaciones[alumSel-1][3]);
					break;
				
				case 5:
					double notaCurso = NotaCurso (calificaciones);
					System.out.println(notaCurso);
					break;
				
				case 6:
					
					int [] indicesMax = NotaMaxima (calificaciones);
					int [] indicesMin = NotaMinima (calificaciones);
					System.out.println("El alumno con mejor nota es " + alumnos[indicesMax[0]] + 
							", su nota es " + calificaciones[indicesMax[0]][indicesMax[1]] + 
							" y la consiguio en la evaluación " + (indicesMax[1]+1));
					System.out.println("El alumno con peor nota es " + alumnos[indicesMin[0]] + 
							", su nota es " + calificaciones[indicesMin[0]][indicesMin[1]] + 
							" y la consiguio en la evaluación " + (indicesMin[1]+1));
					break;
				
				case 7:
					
					break;
				}
				if (opcion !=7) {
					System.out.println("-------------------------------------------------------------------------");
				}
			}
				while (opcion != 7 );
					System.out.println("FIN DEL PROGRAMA");
					
		}
	}
	public static double NotaCurso (double[][] calificaciones) {
		double notaCurso = 0;
		for (int j = 0; j < calificaciones.length; j++) {
			notaCurso += calificaciones[j][3];
		}
		notaCurso = notaCurso/calificaciones.length;
		return notaCurso;
	}
	
	public static int[] NotaMaxima (double[][] calificaciones) {
		
		double notaMax = 0;
		int [] indicesMax = new int[2];

		for (int i = 0; i < calificaciones.length; i++){
			for (int j = 0; j < 3; j++) {
				if (calificaciones[i][j] > notaMax){
					notaMax = calificaciones[i][j];
					indicesMax[0] = i;
					indicesMax[1] = j;
				}
			}
		}
		return indicesMax; 
	}
	
	public static int[] NotaMinima (double[][] calificaciones) {
		
		double notaMin = 10;
		int [] indicesMin = new int[2];

		for (int i = 0; i < calificaciones.length; i++){
			for (int j = 0; j < 3; j++) {
				if (calificaciones[i][j] < notaMin){
					notaMin = calificaciones[i][j];
					indicesMin[0] = i;
					indicesMin[1] = j;
				}
			}
		}
		return indicesMin; 
	}
	
}
