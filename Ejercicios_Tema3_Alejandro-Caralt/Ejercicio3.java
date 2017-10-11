/**
*Ejercicio 3 Alejandro Caralt Caralt
*Muestra en pantalla el valor en pesetas de lo introducido en euros.
*/
public class Ejercicio3 {
  public static void main (String[] args) {
  	String linea;

    System.out.print("Pesetas: ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( linea );
    double euros;
    euros=0.006;
    System.out.println(pesetas * euros + " € ");
  }
}