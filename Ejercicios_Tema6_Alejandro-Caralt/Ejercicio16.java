/**
*Ejercicio16 Alejandro Caralt Caralt
*Realiza un simulador de máquina tragaperras simplificada que cumpla
*los siguientesrequisitos: a)Elordenadormostraráunatiradaqueconsisteenmostrar3
*figuras.Hay5 figurasposibles:corazón,diamante,herradura,campanaylimón.
* b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
* ha perdido”. c)Sihaydosfigurasigualesyunadiferentesedebemostrarelmensaje“Bien,
* ha recuperado su moneda”. d)Silastresfigurassonigualessedebemostrar“Enhorabuena,
*haganado 10 monedas”.
*/
public class Ejercicio16{
  public static void main(String[] args) {
    double figuras = 0;
    int anterior = 0;
    boolean triple = false;
    boolean doble = false;

    for (int i = 0;i < 3 ;i++ ) {
      anterior = (int)figuras;
      figuras = Math.random() * 5;
      switch ((int)figuras) {
        case 0:
        System.out.print("corazón");
        break;

        case 1:
        System.out.print("diamante");
        break;

        case 2:
        System.out.print("herraduera");
        break;

        case 3:
        System.out.print("campana");
        break;

        case 4:
        System.out.print("limón");
      }
      System.out.print(" - ");
      if ((int)figuras == anterior ) {
        doble = true;
      }
      while (doble == true){
        if (((int)figuras == anterior) && (i == 2)) {
          triple = true;
        }
      }
    }
    System.out.println();
    if (triple == true) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    }
    if ((doble == true) && (triple == false)) {
      System.out.println("Bien, ha recuperado su moneda.");
    }
    if (doble == false) {
      System.out.println("Lo siento, ha perdido.");
    }
  }
}