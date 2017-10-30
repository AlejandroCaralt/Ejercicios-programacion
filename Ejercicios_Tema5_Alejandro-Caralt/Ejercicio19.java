/**
*Ejercicio 19 Alejandro Caralt Caralt
*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
*pedir por teclado. El carácter con el que se pinta la pirámide también se debe
*pedir por teclado.
*/
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura de la pirámide");
    int i = Integer.parseInt(sc.nextLine());//Altura
    
    System.out.println("Introduce el simbolo de la pirámide");
    String u = sc.nextLine(); //Simbolo 

    System.out.println("---------------------------");

    int c = 0;//Contador
    int base = 1;//Base de la piramide
    int espacios = i - 1; //Espacios
    int n = 0;//Variable de espacios
    int x = 0;//Variable de base
    do {
      for (n = 0; n < espacios ;n++ ) {//Imprime los espacios de las bases
          System.out.print(" ");
        }
      for (x = 1;x <= base ;x++ ) {//Imprime las bases de la piramide
        System.out.print("*");
        
      }
      System.out.println();
      espacios--;
      base+=2;// Aumenta en dos la base de la piramide
      c++;//Aumenta el contador hasta llegar a la altura
    }while(c < i);
  }
}