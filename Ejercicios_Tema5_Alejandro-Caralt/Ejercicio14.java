/**
*Ejercicio 14 Alejandro Caralt Caralt
*Escribe un programa que pida una base y un exponente (entero positivo) y
*que calcule la potencia.
*/
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0; //Base.
    int e = 0; //Exponente.
    System.out.println("Este programa calcula una potencia en la que se especifica la base y el exponente. **Importante: para cerrar el programa escribe el exponente en negativo");
    do {
      
      System.out.println("Introduce la base:");
      i = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce el exponente:");
      e = Integer.parseInt(sc.nextLine());

      System.out.println(i +" elevedao a " + e + " es igual a: "+ Math.pow(i,e));
        
      }while(e > 0); // Mientras el exponente sea positivo.
  System.out.println();
  }
}