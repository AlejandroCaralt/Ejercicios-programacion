/**
*Ejercicio12 Alejandro Caralt Caralt
*Escribe un programa que muestre los n primeros términos de la serie de
*Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
*y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
*los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
*debe introducir por teclado.
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    long i = 0;
    long anterior = 0;
    long siguiente = 1;
    long actual = 1;
    long suma = 0;

    System.out.println("Introduce cuantos números de la serie Fibonacci quieres ver: ");
    i = Long.parseLong(sc.nextLine());
    System.out.println("-----------------");

    System.out.print("Estos son los " + i + " primeros valores de la serie Fibonacci: " + "0 ");
    do {
      System.out.print(actual + ", ");
      actual = anterior + siguiente;
      anterior = siguiente;
      siguiente = actual; 
      suma ++;

    }while (suma <= (i - 2));
    System.out.println();
  }
}