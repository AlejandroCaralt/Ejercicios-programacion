/**
*Ejercicio17  Alejandro Caralt Caralt
*Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
*/
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduce un número entero para señalar cual es su última cifra: ");
  int i = Integer.parseInt(sc.nextLine());
  if (i < 10) {
        System.out.println("La última y única cifra es " + i);
      } else { 
          System.out.println("La última cifra es" + (i % 10));
        }
  }
} 