/**
*Ejercicio 4 Alejandro Caralt Caralt
*Suma, resta, multiplica y divide dos números introducidos por pantalla.
*/

public class Ejercicio4 {
	public static void main (String[] args){
		String linea;

		System.out.print("Introduce el primer número: ");
		linea = System.console().readLine();
		int primerNumero ;
		primerNumero = Integer.parseInt( linea );

		System.out.print("introduce el segundo número: ");
		linea = System.console().readLine();
		int segundoNumero ;
		segundoNumero = Integer.parseInt( linea );

		System.out.println("La suma de los números es: " + (primerNumero + segundoNumero));
		System.out.println("La resta de los números es: " + (primerNumero - segundoNumero));
		System.out.println("La multiplicación de los números es: " + (primerNumero * segundoNumero));
		System.out.println("La división de los números es: " + (primerNumero / segundoNumero));
	}
}