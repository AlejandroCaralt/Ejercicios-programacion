/**
*Ejercicio2 Alejandro Caralt Caralt
*Escribe un programa que pida 20 números enteros. Estos números se deben
*introducir en un array de 4 filas por 5 columnas. El programa mostrará las
*sumas parciales de filas y columnas igual que si de una hoja de cálculo se
*tratara. La suma total debe aparecer en la esquina inferior derecha.
*/
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		final int FILAS = 4;
		final int COLUMNAS = 5;
		int total = 0;
		int[][] arrayBi = new int[4][5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 20 números, uno por línea.");
		for (int i = 0;i < FILAS ;i++ ) {
			for (int u = 0;u < COLUMNAS ;u++ ) {
				arrayBi[i][u] = Integer.parseInt(sc.nextLine());
			}
		}
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.println("──────────");
		for (int i = 0;i < FILAS ;i++ ) {
			for (int u = 0;u < COLUMNAS ;u++ ) {
				System.out.printf("│%5d    ", arrayBi[i][u]);
				total += arrayBi[i][u];
			}
			System.out.println("│ Fila " + i + " │");
			System.out.print("──────────");
			System.out.print("──────────");
			System.out.print("──────────");
			System.out.print("──────────");
			System.out.print("──────────");
			System.out.println("──────────");
		}
		for (int i = 0;i < COLUMNAS ;i++ ) {
			System.out.printf("│%s %d", "Columna", i);
		}
		System.out.println("| TOTAL " + total);
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.print("──────────");
		System.out.println("──────────");
	}
}