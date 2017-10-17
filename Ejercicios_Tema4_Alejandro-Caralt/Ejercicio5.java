/**
*Ejercicio5 Alejandro Caralt Caralt
*Resuelve una ecuación de segundo grado.
*/
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el valor de 'a': ");
    int a = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el valor de 'b': ");
    int b = Integer.parseInt(sc.nextLine());

    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución real");
    } else {
      System.out.println("x = " + (-b/a));
    }
  


  }
}