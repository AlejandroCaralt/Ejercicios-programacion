/**
*Ejercicio20 Alejandro Caralt Caralt 
*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
*agua. La capacidad será indicada por el usuario. La cuba se llenará con una
*cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
*pueda admitir. El ancho de la cuba no varía.
*/
import java.util.Scanner;

public class Ejercicio20{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura.");
    int alturaIntroducida = Integer.parseInt(sc.nextLine());
    int rellenoAleatorio = (int) (Math.random() * (alturaIntroducida - 1));

    for (int i = 0;i < (alturaIntroducida - 1) ;i++ ) {
      if (i >= ((alturaIntroducida - 1) - rellenoAleatorio)) {
        System.out.print("*====*");
      } else {
        System.out.print("*    *");
      }
      System.out.println();
    }
    System.out.println("******\n");
  }
}