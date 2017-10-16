/**
*Ejercicio 3 Alejandro Caralt Caralt
*Muestra en pantalla el día de la semana según su número del 1 al 7.
*/
import java.util.Scanner ;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("En que día de la semana estamos (1-7): ");
		int dia = Integer.parseInt(sc.nextLine());
		//String diaSemana;

		switch (dia) {
			case 1:
				System.out.println ("Lunes, vamos a empezar bien la semana.");
				break;
			case 2:
				System.out.println("Martes, segundo día de la semana.");
				break;
			case 3:
				System.out.println("Miercoles, mitad de semana.");
				break;
			case 4:
				System.out.println("Jueves, ya queda poco para terminar la semana ¡Animo!.");
				break;
			case 5:
				System.out.println("Viernes, ya es fin de semana practicamente ^^.");
				break;
			case 6:
				System.out.println("Sabado, toca salir con los amigos.");
				break;
			case 7:
				System.out.println("Domingo, mañana lunes :(");
				break; 

			default:
				System.out.println("Te has pasado, una semana solo tiene 7 días.");
				
			}



	}
}