/**
*Ejercicio 1 Alejandro Caralt Caralt
*Multiplica dos números que pide preivamente por pantalla.
*/

public class Ejercicio1 {
	public static void main (String [] args) {
		String linea;

		System.out.print("Introduce un número: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );

		System.out.print("Introduce otro número porfavor: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );

		int total;
		total = (primerNumero * segundoNumero);
		System.out.println(primerNumero + "*" + segundoNumero + "=" + total);
	}
}