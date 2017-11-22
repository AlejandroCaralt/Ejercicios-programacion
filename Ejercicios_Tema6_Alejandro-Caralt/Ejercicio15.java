/**
*Ejercicio15 Alejandro Caralt Caralt 
*/
public class Ejercicio15{
  public static void main(String[] args) {
    double compases = Math.random() * 7;

    for (int contador = 0;contador <= (int)compases ;contador++ ) {
        for (int u = 0;u < 4 ;u++ ) {
            double notas = Math.random() * 7;
            switch ((int)notas) {
            case 0:
            System.out.print("do ");
            break;
            case 1:
            System.out.print("re ");
            break;
            case 2:
            System.out.print("mi ");
            break;
            case 3:
            System.out.print("fa ");
            break;
            case 4:
            System.out.print("sol ");
            break;
            case 5:
            System.out.print("la ");
            break;
            case 6:
            System.out.print("si ");
            break;
          }
        }
      System.out.print("| ");
    }
    System.out.print("|");
    System.out.println();
  }
}