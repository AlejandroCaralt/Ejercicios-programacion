/**
*Ejercicio6 Alejandro Caralt Caralt
*Calcula el área de un triángulo.
*/
public class Ejercicio6 {
	public static void main (String[]args) {

		System.out.print("Base del triángulo(cm): ");
		double base = Double.parseDouble(System.console().readLine());
		System.out.print("Altura del triángulo(cm): ");
		double altura = DOuble.parseDouble(System.console().readLine());
		System.out.println("El área del triángulo es " + (base * altura)/2 + " cm2");
		
	}
}