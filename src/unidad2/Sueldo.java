package unidad2;
import java.util.*;
public class Sueldo {

	public static void main(String[] args) {
		/*En el método main de una clase Java llamada Sueldo escribe un programa que
			resuelva el problema siguiente: un vendedor recibe un sueldo base más un 10%
			extra por comisión de sus ventas; el vendedor desea saber cuánto dinero
			obtendrá por concepto de comisiones, por las tres ventas que realiza en el mes
			y el total que recibirá en el mes, teniendo en cuenta su sueldo base y las
			comisiones. Se utilizará el teclado para la entrada de datos y la consola para la
			salida. Para resolver este problema está permitido utilizar la clase Scanner.*/

		try (Scanner teclado = new Scanner(System.in)) {
			double sueldoBase;
			double venta1;
			double venta2;
			double venta3;
			double sueldoMes;
			System.out.println("Introduzca su sueldo Base:");
			sueldoBase = teclado.nextDouble();
			System.out.println("Introduzca el importe de la primera venta:");
			venta1 = teclado.nextDouble();
			System.out.println("Introduzca el importe de la segunda venta:");
			venta2 = teclado.nextDouble();
			System.out.println("Introduzca el importe de la tercera venta:");
			venta3 = teclado.nextDouble();
			sueldoMes = sueldoBase + (venta1 + venta2 + venta3) * 0.1;
			System.out.printf("Sueldo a final de mes será %.2f€",sueldoMes);
		}
		

	}

}
