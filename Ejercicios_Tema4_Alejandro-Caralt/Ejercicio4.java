/**
*Ejercicio4 Alejandro Caralt Caralt 
*Calcula el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora las primeras 40 y 16 euros la hora despues.
*/
public class Ejercicio4 {
	public static void main (String [] args){

		System.out.print("Horas trabajadas esta semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());

		if (horasTrabajadas <= 40) {
			System.out.println("Salario semanal a 12€/h: " + (horasTrabajadas * 12) + "€");			
		} else {
			System.out.println("Salario con más de 40 horas semanales: " + (((horasTrabajadas - 40)*16)+480) + "€") ;
		}
	
	}
}