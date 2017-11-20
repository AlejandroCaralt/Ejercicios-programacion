/**
*Ejercicio7 Alejandro Caralt Caralt
*Escribeunprogramaquemuestretresapuestasdelaquinielaentrescolumnasparalos14partidosyelplenoalquince(15filas).
*/
public class Ejercicio7 {
 public static void main(String[] args) {

   for (int i = 1;i < 15 ;i++ ) {
     System.out.print("Partido " + i + " - resultado 1x2: ");
     for (int u = 0;u < 3 ;u++ ) {
      double random = Math.random() * 3 + 1;
      random = (int)random;
       System.out.print(" | ");
       if (random == 2) {
         System.out.print("x");
       } else {
         System.out.printf("%.0f",random);
       }
       System.out.print(" |");
      }
     System.out.println();
   }
   double randomPleno = Math.random() * 3 + 1;
   System.out.print("Pleno al 15: ");
   System.out.print(" | ");
   if (randomPleno == 2) {
     System.out.print("x");
   } else {
     System.out.printf("%.0f",randomPleno);
   }
   System.out.print(" |\n");
 }
}