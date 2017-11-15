/**
*Ejercicio1 Alejandro Caralt Caralt
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
*también la suma total (los puntos que suman entre los tres dados).
*/
public class Ejercicio1 {
  public static void main(String[] args) {
    int suma = 0;

    for (int i = 1;i <= 3 ;i++ ) {
      int dado = ((int)(Math.random()*6) + 1);
      suma += dado;
      switch (dado) {
      	case(1):
      	System.out.print("⚀ ");
      	break;

      	case(2):
      	System.out.print("⚁ ");
      	break;

      	case(3):
      	System.out.print("⚂ ");
      	break;

      	case(4):
      	System.out.print("⚃ ");
      	break;

      	case(5):
      	System.out.print("⚄ ");
      	break;

      	case(6):
      	System.out.print("⚅ ");
      	break;
      }
    }
    System.out.println("\nSuma de los tres valores: " + suma);
  }
}