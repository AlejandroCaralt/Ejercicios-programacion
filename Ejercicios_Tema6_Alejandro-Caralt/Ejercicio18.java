/**
*Ejercicio18 Alejandro Caralt Caralt
*Sinestesio y Casilda van a pintar los tres dormitorios de su casa, 
*quieren sustituir el color blanco por colores más alegres. Realiza
* un programa que generedeformaaleatoriaunasecuenciadetrescoloresaleatorios
* (unopara cada dormitorio) de tal forma que no se repita ninguno. 
* Los colores entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja
*/
public class Ejercicio18{
  public static void main(String[] args) {
    int colorAleatorio = (int)(Math.random() * 6);
    int primerColor = colorAleatorio;
    int segundoColor = 0;
    int tercerColor = 0;
    int color = primerColor;

    for (int i = 0;i < 2 ;i ++ ) {
        colorAleatorio = (int)(Math.random() * 6);
        if (i == 0) {
            segundoColor = colorAleatorio;
            while (primerColor == segundoColor) {
                segundoColor = (int)(Math.random() * 6);
            }
        } else {
          tercerColor = colorAleatorio;
          while ((tercerColor == segundoColor) || ( tercerColor == primerColor)){
            tercerColor = (int)(Math.random() * 6);
        }
      }
    }
    for (int i = 0;i < 3 ;i++ ) {
      if (i ==  1) {
        color = segundoColor;
      }
      if ( i == 2) {
        color = tercerColor;
      }
      switch (color) {
        case 0:
        System.out.print("rojo ");
        break;
        case 1:
        System.out.print("azul ");
        break;
        case 2:
        System.out.print("verde ");
        break;
        case 3:
        System.out.print("amarillo ");
        break;
        case 4:
        System.out.print("violeta ");
        break;
        case 5:
        System.out.print("naranja ");
        break;
      }
    }
    System.out.println();
  }
}