/**
*Ejercicio6 Alejandro Caralt Caralt
*Escribe un programa que lea 15 números por teclado y que los almacene en un
*array. Rota los elementos de ese array, es decir, el elemento de la posición 0
*debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
*la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
*del array.
*/
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int numeros = 5;
    int[] numero = new int[numeros];

    System.out.print("Introduce 15 numeros para imprimir en pantalla en orden inverso.\n");
    for (int i = 0;i < numeros ;i++ ) {
      numero[i] = Integer.parseInt(sc.nextLine());
    }
    for (int i = (numeros - 1);i > (numeros/2) ;i-- ) {
      int numeroAnterior = numero[i];
      numero[i] = numero[contador];
      numero[contador] = numeroAnterior;
      contador++;
    }
    for (int i = 0;i < numeros ;i++ ) {
      System.out.print("Posición en el Array " + i + ": " + numero[i] + " \n");
    }
    System.out.println();
  }
}
