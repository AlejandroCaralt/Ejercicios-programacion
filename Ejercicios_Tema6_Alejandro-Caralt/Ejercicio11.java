/**
*Ejercicio11 Alejandro Caralt Caralt
*Escribeunprogramaquemuestre20notasgeneradasalazar.Lasnotasdeben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al finalapareceráelnúmerodesuspensos,elnúmerodesuficientes,elnúmero debienes,etc.
*/
public class Ejercicio11{
  public static void main(String[] args) {
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;

    for (int i = 0;i < 20 ;i++ ) {
      double random = Math.random() * 5;
      switch ((int)random) {
        case 0:
        System.out.print(" suspenso -");
        suspenso++;
        break;

        case 1:
        System.out.print(" suficiente -");
        suficiente++;
        break;

        case 2:
        System.out.print(" bien -");
        bien++;
        break;

        case 3:
        System.out.print(" notable -");
        notable++;
        break;

        case 4:
        System.out.print(" sobresaliente -");
        sobresaliente++;
        break;
      }
    }
    System.out.println();
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Suficientes: " + suficiente);
    System.out.println("Bienes: " + bien);
    System.out.println("Notables: " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);
  }
}