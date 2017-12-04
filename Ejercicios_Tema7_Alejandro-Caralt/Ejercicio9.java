/**
*Ejercicio9 Alejandro Caralt Caralt
*Realiza un programa que pida 8 números enteros y
*que luego muestre esos númerosjuntoconlapalabra“par”o“impar”segúnproceda.
*/
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] enteros = new int[8];

    System.out.print("Introduce 8 numeros enteros.\n");
    for (int i = 0;i < 8 ;i++ ) {
      enteros[i] = Integer.parseInt(sc.nextLine());
    }
    for (int i = 0;i < 8 ;i++ ) {
      if (enteros[i] % 2 == 0) {
        System.out.print(enteros[i] + " par\n");
      } else {
        System.out.print(enteros[i] + " impar\n");
      }
    }

  }
}