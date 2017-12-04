/**
*Ejercicio10 Alejandro Caralt Caralt
*Escribeunprogramaquegenere20númerosenterosaleatoriosentre0y100 y 
*que los almacene en un array. El programa debe ser capaz de pasar 
*todos los números pares a las primeras posiciones del array (del 0 en adelante)
*y todos los números impares a las celdas restantes. Utiliza arrays auxiliares
*si esnecesario
*/
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[20];
    int[] arrayPares = new int[20];
    int[] arrayImpares = new int[20];
    int contador = 0;
    int x = 0;
    int h = 0;

    for (int i = 0;i < 20 ;i++ ) {
      array[i] = (int)(Math.random()* 101);
      System.out.print(array[i] + ". ");
      if (array[i] % 2 == 0) {
        arrayPares[x] = array[i];
        x++;
      } 
      if (array[i] % 2 != 0) {
        arrayImpares[contador] = array[i];
        contador++;
      }
    }
    for (int i = 0;i < 20 ;i++ ) {
      if (arrayPares[i] != 0) {
        array[i] = arrayPares[i];
      } else {
        array[i] = 0;
      }
    }
    for (int i = 0;i < 20 ;i++ ) {
      if (array[i] == 0){
        array[i] = arrayImpares[h];
        h++;
      }
      System.out.print(array[i] + "¡ ");
    }
  }
}
