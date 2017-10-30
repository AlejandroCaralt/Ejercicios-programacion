/**
*Ejercicio11 Alejandro Caralt Caralt
*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
*los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número del que quieres saber su cuadrado y cubo: ");
    int i = 0;
    int n = Integer.parseInt(sc.nextLine());
    
    for (i = n; i <= (n + 4);i++ ) {
      System.out.printf("%4d %6d %8d\n", i, (i*i), (i* i * i));
      
    }

  

  }
}