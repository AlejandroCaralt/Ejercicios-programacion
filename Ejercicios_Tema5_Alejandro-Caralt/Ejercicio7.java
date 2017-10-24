/**
*Ejercicio 7 Alejandro Caralt Caralt
*Realiza el control de acceso a una caja fuerte. La combinación será un
*número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
*acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
*y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
*Tendremos cuatro oportunidades para abrir la caja fuerte.
*/
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String contrasena = "1111";
		int intentos = 4;
		int aciertos = 0;
		boolean acertado = false;

		do{
			System.out.println("Introduce la clave para acceder( 4 dígitos)");
			String digitos = teclado.nextLine();
			intentos--;
			aciertos++;

			if (digitos.equals(contrasena)) {
				System.out.println("Has acertado en " + aciertos + " intentos.");
				acertado = true;
				
			} else {
				System.out.println("Has fallado te quedan " + intentos);
			}
				System.out.printl("Has empleado todos los intentos. La caja se ha bloqueado. Llama a la empresa de seguridad.");
			
		} while ((intentos >0) && !acertado); {
			
		}
	}
}