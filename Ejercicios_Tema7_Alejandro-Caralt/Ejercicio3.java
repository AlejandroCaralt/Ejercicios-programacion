/**
*Ejercicio3 Alejandro Caratl Caralt 
*Escribe un programa que lea 10 números por teclado y que luego los muestre
*en orden inverso, es decir, el primero que se introduce es el último en
*mostrarse y viceversa.
*/
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeroIntroducido = new int[10];

    System.out.println("Introduce 10 numeros.");
    for (int i = 0;i < 10 ;i++ ) {
      numeroIntroducido[i] = Integer.parseInt(sc.nextLine());
    }
    for (int i = 9;i >= 0 ;i-- ) {
      System.out.print(" " + numeroIntroducido[i]);
    }
    System.out.println();
  }
}