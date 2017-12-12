/**
*Ejercicio3 Alejandro Caralt Caralt
*Modifica el programa anterior de tal forma que los números que se introducen
*en el array se generen de forma aleatoria (valores entre 100 y 999).
*/
public class Ejercicio3 {
	public static void main(String[] args) {
		final int FILAS = 4;
		final int COLUMNAS = 5;
		int total = 0;
		int[][] arrayBi = new int[4][5];

		for (int i = 0;i < FILAS ;i++ ) {
			for (int u = 0;u < COLUMNAS ;u++ ) {
				arrayBi[i][u] = (int)(Math.random() * 900 + 100);
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