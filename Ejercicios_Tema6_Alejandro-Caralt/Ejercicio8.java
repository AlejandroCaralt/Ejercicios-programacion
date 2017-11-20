/**
*Ejercicio8 Alejandro Caralt Caralt
*Modificaelprogramaanteriorparaquelaprobabilidaddequesalgaun1sea de1/2,laprobabilidaddequesalgax seade1/3ylaprobabilidaddequesalga 2seade1/6.Pista:1/2=3/6y1/3=2/6.
*/
public class Ejercicio8{
  public static void main(String[] args) {

    for (int i = 1;i < 15 ;i++ ) {
      System.out.print("Partido " + i + " - resultado 1x2: ");
       for (int u = 0;u < 3 ;u++ ) {
        double randomUno = Math.random() * 6 + 1;
        System.out.print("| ");
        switch ((int)randomUno) {
          case 1:
          System.out.print("1");
          break;
          case 2:
          System.out.print("1");
          break;
          case 3:
          System.out.print("1");
          break;

          case 4:
          System.out.print("x");
          break;
          case 5:
          System.out.print("x");
          break;

          case 6:
          System.out.print("3");
          break;
        }
      }
      System.out.print(" |\n");
    }

    double randomPleno = Math.random() * 3 + 1;
    System.out.print("Pleno al 15: ");
    System.out.print(" | ");
     if (randomPleno == 2) {
       System.out.print("x");
     } else {
       System.out.printf("%.0f",randomPleno);
     }
     System.out.print(" |\n");
  }
}