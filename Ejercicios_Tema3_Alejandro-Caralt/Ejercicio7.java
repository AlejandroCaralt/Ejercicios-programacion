ee/**
*Ejercicio 7 Alejandro Caralt Caralt
*Calcula el total de una factura a partir de la base imponible.
*/
public class Ejercicio7 {
	public static void main (Strings[]args) {
		System.out.print("Introduce la base imponible: ");
		double baseImponible = Double.parseDouble(System.console().readLine());

		System.out.print("Total con IVA(21%): " + (baseImponible * 1.21));
	}
}