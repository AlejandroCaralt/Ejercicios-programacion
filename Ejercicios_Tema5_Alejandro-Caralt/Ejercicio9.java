/**
*Ejercicio9 Alejandro Caralt Caralt
*Realiza un programa que nos digas cuántos dígitos tiene un número introducido por teclado.
*/

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número del que quieras saber cuantos dígitos tiene.");
    int i = Integer.parseInt(sc.nextLine());
    int digitos = 0;

    while (i > 0) {
      i = i/10;
      digitos ++;
    }
    System.out.println("El número que has introducido " + digitos + " dígitos" );
  }
}