/**
* Ejercicio11 Alejandro Caralt Caralt
*Conversor de Kb a Mb.
*/
public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.print("Introduce los Kb que quieres pasar a Mb: ");
		double kb = Double.parseDouble(System.console().readLine());
		System.out.println(kb + " Kb son: " + (kb / 1024) + "Mb");
		
	}
}