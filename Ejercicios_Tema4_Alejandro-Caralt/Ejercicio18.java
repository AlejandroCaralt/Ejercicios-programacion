/**
*Ejercicio18  Alejandro Caralt Caralt
*Muestra la primera cifra de un número entero introducido por teclado maximo 5 cifras.
*/
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número entero de máximo 5 cifras:");
    int num = Integer.parseInt(sc.nextLine());
    int c = 0;
    if ( num < 10) {
      c = num ;
    } else if ( num < 100) {
        c = num / 10;
    } else if ( num < 1000) {
        c = num /  100;
    } else if ( num < 10000) {
        c = num / 1000;
    } else if ( num <= 99999) {
        c = num / 10000;
    } else if ( num >= 100000) {
        System.out.println("ERROR: El máximo de cifras del número introducido tiene que ser 5.");
	}
	System.out.println("La primera cifra del número introducido es el " + c);
  }
}
