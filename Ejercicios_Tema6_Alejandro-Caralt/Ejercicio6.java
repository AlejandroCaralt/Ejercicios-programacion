/**
*Ejercicio6 Alejandro Caralt Caralt
*Escribe un programa que piense un número al azar entre 0 y 100. El usuario
*debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
*fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
*ducido es menor o mayor que el número secreto.
*Mini-juego personalizado por Alejandro Caralt
*/
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numeroAleatorio = (int)(Math.random() * 101);
    int intentos = 5;
    boolean respuesta = false;
    int menuInt = 0;
    String menu;
    do{
      System.out.println("Respuesta para testeo: " + numeroAleatorio);
      System.out.println("\nIntenta adivinar el número que he pensado, tienes " + intentos + " intentos y te diré si es mayor o menor al que me digas, intentalo a ver si puedes conseguirlo.\n");
      menuInt = 0;
      do {
        intentos--;
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        System.out.println();

        if (numeroIntroducido == numeroAleatorio){
          respuesta = true;
          intentos-=5;
        }
        if ((numeroIntroducido != numeroAleatorio) && (intentos > 0)) {
          System.out.println("Buen intento te quedan : " + intentos + " intentos.");
        }
        if ((numeroIntroducido > numeroAleatorio)  && (intentos > 0)) {
          System.out.println("El número es menor al que has introducido.\n");
        }
        if ((numeroIntroducido < numeroAleatorio)  && (intentos > 0)) {
          System.out.println("El número es mayor al que has introducido.\n");
        }
      } while((respuesta == false) && (intentos > 0));

      if (respuesta == false) {
        System.out.println("Buen intento, el numero era " + numeroAleatorio + ", que cerca has estado. \nIntentalo de nuevo.");
        System.out.println("Escribe 'AGAIN' para intentarlo de nuevo. ");
        System.out.println("Escribe 'EXIT' para cerrar el juego.");
        menu = System.console().readLine().toUpperCase();
      } else {
        System.out.println("Lo has adividado, te lo he puesto muy facil intentalo de nuevo con 3 intentos a ver si puedes.");
        System.out.println("Escribe 'NIVEL2' para intentarlo con tres intentos. ");
        System.out.println("Escribe 'EXIT' para cerrar el juego.\n");
        menu = System.console().readLine().toUpperCase();
      }
      switch (menu) {
        case "AGAIN":
        menuInt = 1;
        numeroAleatorio = (int)(Math.random() * 101);
        respuesta = false;

        break;

        case "NIVEL2":
        menuInt = 2;
        intentos = 3;
        numeroAleatorio = (int)(Math.random() * 101);
        respuesta = false;
        break;

        default:
        menuInt = 0;
      }
    } while (menuInt > 0);
  }
}