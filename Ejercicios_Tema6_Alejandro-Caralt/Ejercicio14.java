/** 
*Ejercicio14 Alejandro Caralt Caralt
*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará adivinar el número que estás pensando - un número entre0y100-teniendoparaello5oportunidades.Encadaintentofallido,el programadebepreguntarsielnúmeroqueestáspensandoesmayoromenor queelqueteacabadedecir.
*/
public class Ejercicio14{
  public static void main(String[] args) {
    double random = Math.random()*100;
    int contador = 1;
    int intentos = 5;
    int limiteSuperior = 100;//Limite de rango superior.
    int limiteInferior = 0;// Limite de rango inferior.
    int numeroMenor = 0;//Mínimo numero al que suma.
    boolean flag = false;//Comprueba si ha acertado.

    while((contador < intentos) && (flag == false)){//Bucle de preguntas hasta que acierte o no tenga intentos.
      contador++;
      //System.out.print((limiteSuperior - limiteInferior) + " " + numeroMenor); Muestra el rango de número por el que busca el correcto.
      System.out.println("¿El número es el " + (int)random + "?(si/no)");
      String acierto = System.console().readLine();

      if (acierto.equals("si")){//Si ha acertado deja de preguntar.
        flag = true;
        System.out.println("Enhorabuena has acertado.");
      } else {
	      System.out.println();
	      System.out.println("¿Es mayor o menor?");
	      String respuesta = System.console().readLine().toUpperCase();
	      System.out.println();

	      switch (respuesta) {
	      	case "MAYOR":
          numeroMenor = ((int)random) + 1;
	      	limiteInferior = ((int)random) + 1;
	      	break;

	      	case "MENOR":
          limiteSuperior = ((int)random) - 1;

	      	break;

	      	default:
	      	System.out.print("No has introducido los datos correctamente. Inicializa el programa de nuevo.");
	      	flag = true;	      
        }

        random = Math.random() * (limiteSuperior - limiteInferior) + numeroMenor;
      }
    }
  }
}