/**
*Ejercicio 5 Alejandro Caralt Caralt
*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Muestra los números entre el 320 y el 160 de 20 en 20.");
    int i = 320;
    System.out.print(i);
    while (i > 160) {
      System.out.print(" - " + (i -= 20));
    }
  }
}
