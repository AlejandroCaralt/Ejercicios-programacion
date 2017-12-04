/**
*Ejercicio4 Alejandro Caralt Caralt
*Define tres arrays de 20 números enteros cada una, con nombres numero ,
*cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
*array cuadrado se deben almacenar los cuadrados de los valores que hay en el
*array numero . En el array cubo se deben almacenar los cubos de los valores que
*hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
*en tres columnas.
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    double[] cuadrado = new double[20];
    double[] cubo = new double[20];
    System.out.print("  N  Cuadrado  Cubo \n");
    for (int i = 0;i < 20 ;i++ ) {
      numero[i] = (int)(Math.random() * 101);
      cuadrado[i] = (float)(Math.sqrt(numero[i]));
      cubo[i] = (float)(Math.cbrt(numero[i]));

      System.out.printf( " %d | %.2f | %.2f",numero[i],cuadrado[i],cubo[i]);
      System.out.println();
    }
  }
}