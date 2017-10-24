/**
*Ejercicio 8 Alejandro Caralt Caralt
*Muestra la tabla de multiplicar de un número introducido por teclado.
*/
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int u = 0;
    System.out.println("Introduce el número de la tabla de multiplicar que quieres ver.");

    for (int i = Integer.parseInt(sc.nextLine());u <= 10 ;u++ ) {
      System.out.println(u + " x " + i + " = " + (u*i));
    }
  }
}