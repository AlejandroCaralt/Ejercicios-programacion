/**
*Ejercicio2 Alejandro Caralt Caralt
*Muestra por pantalla un saludo dependiendo de la hora que se introduzca.
*/
import java.util.Scanner ;

public class Ejercicio2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in) ;

		System.out.println("¿Que hora es?");
		int hora = sc.nextInt();
		String saludo;

 
			if ((hora >= 6) && (hora <= 12)) {
				System.out.println("Buenos días.");
			}else if ((hora >= 13) && (hora <= 20)) {
				System.out.println("Buenas tardes.");
			}		else {
				System.out.println("Buenas noches");

			}

				
		
		
	}
}