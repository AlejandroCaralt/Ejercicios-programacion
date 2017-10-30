/**
*Ejercicio 10 Alejandro Caralt Caralt
*Escribe un programa que calcule la media de un conjunto de números positivos
*introducidos por teclado. A priori, el programa no sabe cuántos números se
*introducirán. El usuario indicará que ha terminado de introducir los datos
*cuando meta un número negativo.
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Introduce los datos de los que quieres sacar la media aritmética. **Importante: para terminar de introducir datos introduce un número negativo(-1).");
    
    int i = 0;
    int suma = 0;
    int numeroIntroducidos = 0;
  
    while (i >= 0) {
      i = Integer.parseInt(sc.nextLine());
      suma += i ;
      numeroIntroducidos ++;

    }
    System.out.println("La media de los números es " + ((double)(suma - i) / (numeroIntroducidos - 1)));
  }

}