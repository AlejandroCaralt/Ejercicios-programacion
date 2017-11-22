/**
*Ejercicio22 Alejandro Caralt Caralt 
*Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
*aleatorio. La cabeza se representará con el carácter @ y se debe colocar
*exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
*el cuerpo irá serpenteando de la siguiente manera: se generará de forma
*aleatoria un valor entre tres posibles que hará que el siguiente carácter se
*coloque una posición a la izquierda del anterior, alineado con el anterior o una
*posición a la derecha del anterior. La longitud de la serpiente se pedirá por
*teclado y se supone que el usuario introducirá un dato correcto.
*/
import java.util.Scanner;

public class Ejercicio22{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int espacios = 10;
    System.out.print("Introduce la longitud de la serpiente contando la cabeza.");
    int longitud = Integer.parseInt(sc.nextLine());
    for (int i = 0;i < longitud ;i++ ) {
      int zigzagueo = (int)(Math.random() * 3) - 1;
      espacios += zigzagueo;
      for(int u = 0; u < espacios; u++) {
        System.out.print(" ");
      }
      if (i == 0) {
        System.out.println("0");
      } else {
        System.out.println("*");
      }
    }
  }
}