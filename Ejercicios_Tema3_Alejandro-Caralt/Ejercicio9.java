/**
*Ejercicio 9 Alejandro Caralt Caralt
*Calcula el volumen de un cono.
*/
public class Ejercicio9 {
	public static void main(String[] args) {
		System.out.print("Introduce el radio del cono: ");
		double r = Double.parseDouble(System.console().readLine());
		System.out.println("Introduce la altura del cono: ");
		double h = Double.parseDouble(System.console().readLine());
		double π = "3.14159265359"
		System.out.println("El volumen del cono es: " + (π*(r*r)*h/3) + "cm3");
	}
	
}