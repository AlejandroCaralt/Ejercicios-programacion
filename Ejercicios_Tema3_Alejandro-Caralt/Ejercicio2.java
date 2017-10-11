/**
*Ejercicio 2 Alejandro Caralt Caralt
*Muestra en pantalla el valor en pesetas de lo introducido en euros.
*/
public class Ejercicio2 {
  public static void main (String[] args) {
  	String linea;

    System.out.print("Euros: ");
    linea = System.console().readLine();
    int euros;
    euros = Integer.parseInt( linea );
    double pesetas;
    pesetas = 166.684;
    
    System.out.println(euros + "€" + " son " + (euros * pesetas) + " pesetas");
  }
}