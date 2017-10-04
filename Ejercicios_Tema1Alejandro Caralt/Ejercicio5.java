/**
*Ejercicio5 Alejandro Caralt
*Muestra por pantalla el horario de clases de 1ºDAM diferenciado por colores.
*/
public class Ejercicio5 {
  public static void main (String[] args) {

    String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m"; 
    String blanco="\033[37";

    System.out.printf(rojo + "%s" verde + "%s" rojo +  "%s" naranja + "%s" "%s", "PRO", "SINF", "PRO", "ED", "SINF");
    System.out.printf(rojo + "%s" verde + "%s" rojo +  "%s" naranja + "%s" "%s", "PRO", "SINF", "PRO", "ED", "SINF");
    System.out.printf(rojo + "%s" verde + "%s" rojo +  "%s" naranja + "%s" "%s", "PRO", "SINF", "PRO", "ED", "SINF");
    System.out.printf(azul + "%s" morado + "%s" azul + "%s" morado + "%s" blanco + "%s", "BBDD", "LM", "BBDD", "LM", "FOL");
    System.out.printf(azul + "%s" rojo + "%s" azul + "%s" morado + "%s" blanco + "%s", "BBDD", "LM", "BBDD", "LM", "FOL");
    System.out.printf(azul + "%s" rojo + "%s" azul + "%s" morado + "%s" blanco + "%s", "BBDD", "LM", "BBDD", "LM", "FOL");
  }
}
