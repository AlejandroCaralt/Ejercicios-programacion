/** 
* Ejercicio 1 Alejandro Caralt Caralt
*Muestra por pantalla la asignatura que tengamos a primera hora según el día que introduzcamos.
*/

import java.util.Scanner ;

public class Ejercicio1 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el día de la semana: ");
		String dia = sc.nextLine().toUpperCase();
		String asignatura;

		switch (dia) {
			case "LUNES":
				asignatura = "Programación" ;
				break;

			case "MARTES":
				asignatura = "Sistemas informáticos";
				break;
			case "MIÉRCOLES":
				//Continua la opción.
			case "MIERCOLES":
				asignatura = "Programación";
				break;

			case "JUEVES":
				asignatura = "Entornos de desarrollo";
				break;

			case "VIERNES":
				asignatura = "Sistemas informáticos";
				break;

			default:
				asignatura = "No se de que día me hablas, yo tengo clases de lunes a viernes";


		}

	System.out.println("El " + dia + " tenemos: " + asignatura);
	}
}
