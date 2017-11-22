/**
*Ejercicio12 Alejandro Caratl Caralt
*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
*con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
*convertir un entero en un carácter.
*/

public class Ejercicio12{
  public static void main(String[] args) {
    throws InterruptedException {

      for (int i = 0;i < 15000 ;i++ ) {
        char matrix = (char)(Math.random() * 95 + 32);
        System.out.print(matrix);
        Thread.sleep(5);
      }
    }
  }
}