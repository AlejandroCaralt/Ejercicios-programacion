/**
*Ejercicio 5 Alejandro Caralt Caralt
*Calcula el área de un rectángulo.
*/

public class Ejercicio5 {
	public static void main (String[]args) {
		String linea;

		System.out.print("Introduce el lado mayor del rectángulo: ");
		linea = System.console().readLine();
		double ladoMayor ;
		ladoMayor = Double.parseDouble( linea );

		System.out.print("Introduce el lado menor del rectángulo: ");
		linea = System.console().readLine();
		double ladoMenor ;
		ladoMenor = Double.parseDouble( linea );

		System.out.println("El área del rectángulo es: " + (ladoMayor * ladoMenor));
	}
}