/**
*Ejercicio8 Alejandro Caralt Caralt 
*Calcula el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
*/
public class Ejercicio8 {
	public static void main (Strings [] args){
		System.out.print("Horas trabajadas esta semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
		System.out.println("Salario semanal a 12€/h: " + (horasTrabajadas * 12) + "€");
	}
}