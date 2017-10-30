/**
*Ejercicio 20 Alejandro Caralt Caralt
*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*/

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura de la pirámide");
    int i = Integer.parseInt(sc.nextLine());//Altura

    System.out.println("Introduce el simbolo de la pirámide");
    String u = sc.nextLine(); //Simbolo 

    System.out.println("---------------------------");

    int c = 0;//Contador
    int base = 1;//Base de la piramide
    int espacios = i - 1; //Espacios exteriores
    int n = 0;//Variable de espacios exteriores
    int x = 0;//Variable de base
    int ladoIzquierdo = 0;

    do {
      for (n = 0; n < espacios ; n++ ) {//Imprime los espacios exteriorese
          System.out.print(" ");


        }
      System.out.print("*");

      if (c < i && c !=0 ) {
      for (x = 1; x <= base ; x++ ) {//Imprime la ultima base del triangulo
        System.out.print(" ");
        }
        base+=2;
      }
      if (c < i && c !=0 ){
        System.out.print("*");
      }
      System.out.println();
      espacios--;

      c++;//Aumenta el contador hasta llegar a la altura
    }while(c < (i - 1));
    for (x = 1; x <= (base + 2) ; x++ ) {//Imprime la ultima base del triangulo
      System.out.print("*");
    }
    System.out.println();
  }
}