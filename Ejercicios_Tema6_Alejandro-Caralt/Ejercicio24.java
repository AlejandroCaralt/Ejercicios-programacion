/**
*Ejercicio24 Alejandro Caratl Caralt 
*Escribe un programa que, dado un número introducido por teclado, elija al azar
*uno de sus dígitos.
*/
import java.util.Scanner;

public class Ejercicio24{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 1;
    System.out.print("Introduce un número.");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    int copiaNumero = numeroIntroducido;
    while (copiaNumero > 9){
      contador++;
      copiaNumero = (copiaNumero / 10);
    }

    int numeroAleatorio = (int)(Math.random() * contador);
    for (int i = 0;i < numeroAleatorio ;i++ ) {
      numeroIntroducido = numeroIntroducido / 10;
    }
    System.out.println(numeroIntroducido % 10);
  }
}