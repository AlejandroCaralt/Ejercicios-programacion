/**
*Ejercicio19 Alejandro Caralt Caralt
*Escribe un programa que muestre 50 números enteros aleatorios comprendi-
*dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
*luego el máximo de los pares el mínimo de los impares y la media de todos los
*números generados.
*/
public class Ejercicio19{
  public static void main(String[] args) {
    int suma = 0;
    int parMayor = 0;
    int imparMenor = 0;

    for (int i = 0;i < 50 ;i++ ) {
      int numeroAleatorio = (int)((Math.random() * 301) - 100);
      suma+= numeroAleatorio;
      System.out.print(numeroAleatorio + " ");
      if ((numeroAleatorio % 2) == 0) {
        if (numeroAleatorio > parMayor) {
          parMayor = numeroAleatorio;
        }
      } else {
        if (numeroAleatorio < imparMenor) {
          imparMenor = numeroAleatorio;
        }
      }
    }
    System.out.println();
    System.out.println("Número par más grande: " + parMayor + ", número impar más pequeño: " + imparMenor + ", media de los números: " + (suma/50));
  }
}