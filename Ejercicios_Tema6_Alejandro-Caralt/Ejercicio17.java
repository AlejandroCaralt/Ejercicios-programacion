/**
*Ejercicio17 Alejandro Caralt Caralt
*Realizaunprogramaquepinteporpantallaunapeceraconunpececitodentro. 
*Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán 
*de 4 unidades. No hay que comprobar que los datos se introducen correctamente; podemos 
*suponer que el usuario los introduce bien. Dentro delapecerahayquecolocardeformaaleatoriaunpe
*cito,quepuedeestar situadoencualquieradelasposicionesquequedanenelhuecoqueformael rectángulo.
*/
import java.util.Scanner;

public class Ejercicio17{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la anchura de la pecera.");
    int anchuraIntroducida = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce la altura de la pecera.");
    int alturaIntroducida = Integer.parseInt(sc.nextLine());
    int anchuraAleatoria = (int)((Math.random() * (anchuraIntroducida - 2)) + 1);
    int alturaAleatoria = (int)((Math.random() * (alturaIntroducida - 2)) + 1);
    String simboloPecera = "*";
    String simboloAgua = "~";
    //Parte superior de la pecera
    for (int i = 0;i < anchuraIntroducida ;i++ ) {
    	System.out.print(simboloPecera);
    }
    System.out.println();
    //Parte central
    for (int i = 1;i < (alturaIntroducida - 1) ;i++ ) {
    	System.out.print(simboloPecera );
    	//Agua de la pecera
    	for (int u = 1;u < (anchuraIntroducida - 1) ;u++ ) {
    		//Dibuja el pez en la posición aleatoria
    		if ((anchuraAleatoria == u) && (alturaAleatoria == i)) {
    			System.out.print("=");
    		} else {
    			System.out.print(simboloAgua);
    		}
    	}
    	System.out.println(simboloPecera);
    }
    //Parte inferior de la pecera
    for (int i = 0;i < anchuraIntroducida ;i++ ) {
    System.out.print(simboloPecera);	
    }
    System.out.println();
  }
}