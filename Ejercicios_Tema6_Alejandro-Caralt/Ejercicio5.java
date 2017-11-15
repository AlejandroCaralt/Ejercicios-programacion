/**
*Ejercicio5 Alejandro Caralt Caralt
*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
*separados por espacios. Muestra también el máximo, el mínimo y la media
*de esos números.
*/
public class Ejercicio5{
  public static void main(String[] args) {
    
    int suma = 0;
    int minimo = 199;
    int maximo = 0;
    int cantidadNumeros = 50;

    for (int i = 0;i < cantidadNumeros ;i++ ) {
      int numeroAleatorio = ((int)(Math.random()*100 + 100));
      System.out.print(numeroAleatorio + " ");
      if (numeroAleatorio < minimo) {
        minimo = numeroAleatorio;
      }
      if (numeroAleatorio > maximo) {
        maximo = numeroAleatorio;
      }
      suma += numeroAleatorio;
    }
    System.out.println();
    System.out.println("El minimo ha sido " + minimo + " y el maximo " + maximo);
    System.out.println("La media de los numeros: " + (suma / cantidadNumeros));
  }
}