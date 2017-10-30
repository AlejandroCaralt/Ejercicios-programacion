/**
*Ejercicio 13 Alejandro Caralt Caralt
*Escribe un programa que lea una lista de diez números y determine cuántos
*son positivos, y cuántos son negativos.
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Lista de números");
    int i = 0;
    int positivos = 0;
    int negativos = 0;
    int total = 0;

      do {
      i = sc.nextInt();
      
      total ++;
      if (i < 0) {
        negativos ++;
      } else {
        positivos ++;
      }
    }while(total <10);
    System.out.println("Positivos: " + positivos + " y negativos: " + negativos);
  }
}