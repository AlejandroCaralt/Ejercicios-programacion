/**
*Ejercicio25 Alejandro Caratl Caralt 
*Escribe un programa que muestre por pantalla 100 números enteros separa-
*dos por un espacio. Los números deben estar generados de forma aleatoria
*en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
*almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*/
public class Ejercicio25{
  public static void main(String[] args) {
    boolean primo = true;
    boolean multiplo = false;

    for (int i = 0; i < 100 ;i++ ) {
      int numeroAleatorio = (int)(Math.random() * 191) + 10;
      for (int u = 2; u != numeroAleatorio ;u++ ) {
        if (numeroAleatorio % u == 0) {
          primo = false;
        }
        if (numeroAleatorio % 5 == 0) {
          multiplo = true;
        }
      }
      if (primo == true) {
        System.out.print(" #" + numeroAleatorio + "# ");
      }
      if (multiplo == true) {
        System.out.print(" [" + numeroAleatorio + "] ");
      }
      if ((primo == false) && (multiplo == false)) {
        System.out.print(" " + numeroAleatorio + " ");
      }
      primo = true;
      multiplo = false;
    }
    System.out.println();
  }
}