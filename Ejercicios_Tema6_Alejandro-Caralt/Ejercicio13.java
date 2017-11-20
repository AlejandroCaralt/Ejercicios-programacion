/**
*Ejercicio13 Alejandro Caralt Caralt
*Escribe un programa que simule la tirada de dos dados. El programa deberá continuartirandolosdadosunayotravezhastaqueenalgunatiradalosdos dadostenganelmismovalor
*/
public class Ejercicio13{
  public static void main(String[] args) {
    boolean flag = false;
    do{
      double randomUno = Math.random() * 6 + 1;
      double randomDos = Math.random() * 6 + 1;
      if ((int)randomUno == (int)randomDos) {
        flag = true;
      }
      System.out.println((int)randomUno + " - " + (int)randomDos);
    } while(flag == false);
  }
}