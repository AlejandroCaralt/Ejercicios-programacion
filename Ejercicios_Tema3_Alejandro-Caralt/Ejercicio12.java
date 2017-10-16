/**
*Ejercicio 12 Alejandro Caralt Caralt
*Calcula la media para el segundo examen contando que el primero vale un 40% de la nota y el segundo un 60%.
*/
public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.print("Introduce la nota del primer examen: ");
		double primerExamen = Double.parseDouble(System.console().readLine());
		System.out.print("¿Qué nota quieres sacar en el trimestre? ");
		double media = Double.parseDouble(System.console().readLine());
		System.out.println("Para tener un " + media + " de media en el trimestre necesitas sacar un " + ((media * 100) - (primerExamen * 40)/60) + "en el segundo examen.");
}