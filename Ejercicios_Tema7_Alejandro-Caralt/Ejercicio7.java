/**
*Ejercicio 7 Alejandro Caralt Caralt
*Escribeunprogramaquegenere100númerosaleatoriosdel0al20yquelos
*muestre por pantalla separados por espacios. El programa pedirá entonces
*por teclado dos valores y a continuación cambiará todas las ocurrencias del
*primervalorporelsegundoenlalistageneradaanteriormente.Losnúmeros quesehancambiado
*debenaparecerentrecomillados
*/

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    int[] array = new int[100];
    Scanner sc = new Scanner(System.in);

    for (int i = 0;i < 100 ;i++) {
      int numeroAleatorio = (int)(Math.random() * 21);
      System.out.print(numeroAleatorio + " ");
      array[i] = numeroAleatorio;
    }

    System.out.print("\n Introduce un número: ");
    int primerNumero = Integer.parseInt(sc.nextLine());

    System.out.print("\n Introduce el segundo número: ");
    int segundoNumero = Integer.parseInt(sc.nextLine());

    for (int i = 0;i < 100 ;i++) {
      if (array[i] == primerNumero) {
        array[i] = segundoNumero;
        System.out.print("'" + array[i] + "' ");
      } else {
        System.out.print(array[i] + " ");
      }
    }
  }
}