/**
* Ejercicio10 Alejandro Caralt Caralt
*Conversor de Mb a Kb.
*/
public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.print("Introduce los Mb que quieres pasar a Kb: ");
		double mb = Double.parseDouble(System.console().readLine());
		System.out.println(mb + " Mb son: " + (mb * 1024) + "Kb");
		
	}
}