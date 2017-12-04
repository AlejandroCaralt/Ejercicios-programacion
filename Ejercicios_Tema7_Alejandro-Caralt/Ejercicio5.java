/**
*Ejercicio5 Alejandro Caralt Caralt
*Escribe un programa que pida 10 números por teclado y que luego muestre
*los números introducidos junto con las palabras “máximo” y “mínimo” al lado
*del máximo y del mínimo respectivamente.
*/
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    Scanner sc = new Scanner(System.in);
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    System.out.print("Introduce 10 números para señalar cual es el mayor y el menor.");
    for (int i = 0;i < 10 ;i++ ) {
      numero[i] = Integer.parseInt(sc.nextLine());
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.print("--------------------------------------------------------------------------\n");
    for (int i = 0;i < 10 ;i++ ) {
      System.out.print( " " + numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" - máximo");
      }
      if (numero[i] == minimo) {
        System.out.print(" - mínimo");
      }
      System.out.println();
    }
  }
}
