/**
*Ejercicio15  Alejandro Caralt Caralt
*Escribe un programa que pinte una pirámide rellena con un carácter introducidoportecladoquepodráserunaletra,unnúmeroounsímbolocomo*,+, -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierdaohacialaderecha.
*/
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el carácter de la piramide: ");
    String x = sc.nextLine();
    System.out.println("Selecciona el tipo de pirámide que quieres: ");
    System.out.print("1- Pirámide vertical ↑ ");
    System.out.print("2- Pirámide invertida ↓ ");
    System.out.print("3- Pirámide ladeada a la izquierda ← ");
    System.out.print("4- Pirámide ladeada a la derecha → ");
    int tipoPiramide = Integer.parseInt(sc.nextLine());

    switch (tipoPiramide) {
      case 1:
        System.out.println(" " + " " + " " + x + " " + " " + " ");
        System.out.println(" " + " " + x + x + x +" " + " ");
        System.out.println(" " + x + x + x + x + x + " ");
        System.out.println(x + x + x + x + x + x + x);
        break;

      case 2:
        System.out.println(x + x + x + x + x + x + x);
        System.out.println(" " + x + x + x + x + x + " ");
        System.out.println(" " + " " + x + x + x +" " + " ");
        System.out.println(" " + " " + " " + x + " " + " " + " ");
        break;
      case 3:
        System.out.println(" " + " " + x);
        System.out.println(" " + x + x );
        System.out.println(x + x + x );
        System.out.println(" " + x + x );
        System.out.println(" " + " " + x);
        break;
      case 4:
        System.out.println(x + " " + " ");
        System.out.println(x + x + " ");
        System.out.println(x + x + x );
        System.out.println(x + x + " ");
        System.out.println(x +" " + " ");
        break;

      default:
        System.out.println("Porfavor introduce bien el número del tipo de pirámide que quieres hacer(1-4.");

    }
  }
}