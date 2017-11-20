/**
*Ejercicio10 Alejandro Caralt Caralt
*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria entreunodelossiguientes:*,-,=,.,|,@.Laslíneasdebentenerunalongitud aleatoriaentre1y40caracteres.
*/
public class Ejercicio10{
  public static void main(String[] args) {
    int lineas = 10;
    for (int i = 0;i < 10 ;i++ ) {
      double randomLinea = Math.random() * 40 + 1;
      for (int u = 0;u < (int)randomLinea ;u++ ) {
        double randomSimbolo = Math.random() * 6;
        switch ((int)randomSimbolo) {
          case 0:
          System.out.print("*");
          break;
          case 1:
          System.out.print("-");
          break;
          case 2:
          System.out.print("=");
          break;
          case 3:
          System.out.print(".");
          break;
          case 4:
          System.out.print("|");
          break;
          case 5:
          System.out.print("@");
          break;

        }
      }
      System.out.println();
    }
  }
}