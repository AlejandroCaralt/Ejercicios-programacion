/**
*Ejercicio8 Alejandro Caralt Caralt
*Realizaunprogramaquepidalatemperaturamediaquehahechoencadames
*deundeterminadoañoyquemuestreacontinuaciónundiagramadebarras
*horizontalesconesosdatos.Lasbarrasdeldiagramasepuedendibujarabase
*deasteriscosocualquierotrocarácter.
*/
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] temperaturas = new int[12];

    System.out.print("Introduce las temperaturas registradas en Málaga en todo el año. (25ºC a -5ºC)\n");
    for (int i = 0;i < 12 ;i++ ) {
      temperaturas[i] = (int)(Math.random()*31 - 5);//Registro de temperaturas automático.
      //temperaturas[i] = Integer.parseInt(sc.nextLine()); //Resgistro de temperaturas manual.
    }

    for (int i = 0;i < 12 ;i++ ) {
      for (int u = 25; u > 0 ;u-- ) {
        if (temperaturas[i] < u) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.print("|");
      for (int u = 0;u > (-5) ;u-- ) {
        if (temperaturas[i] < u) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print(temperaturas[i] + "ºC ");
      switch (i) {
      case 0:
        System.out.print("Enero");
        break;
      case 1:
        System.out.print("Febrero");
        break;
      case 2:
        System.out.print("Marzo");
        break;
      case 3:
        System.out.print("Abril");
        break;
      case 4:
        System.out.print("Mayo");
        break;
      case 5:
        System.out.print("Junio");
        break;
      case 6:
        System.out.print("Julio");
        break;
      case 7:
        System.out.print("Agosto");
        break;
      case 8:
        System.out.print("Septiembre");
        break;
      case 9:
        System.out.print("Octubre");
        break;
      case 10:
        System.out.print("Noviembre");
        break;
      case 11:
        System.out.print("Diciembre");
        break;
      }
      System.out.print("\n");
    }
  }
}