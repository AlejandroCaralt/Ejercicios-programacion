/**
*Ejercicio 1 Alejandro Caralt Caralt
*Define un array de números enteros de 3 filas por 6 columnas con nombre num
*y asigna los valores según la siguiente tabla. Muestra el contenido de todos
*los elementos del array dispuestos en forma de tabla como se muestra en la
*figura.
*/
public class Ejercicio1 {
	public static void main(String[] args) {
		
		final int FILAS = 3;
		final int COLUMNAS = 6;
		int[][] arrayBidimensional = new int[3][6];

		arrayBidimensional[0][0] = 0;
		arrayBidimensional[1][0] = 75;
		arrayBidimensional[0][1] = 2;
		arrayBidimensional[0][2] = 2;
		arrayBidimensional[2][2] = (-2);
		arrayBidimensional[2][3] = 9;
		arrayBidimensional[1][4] = 0;
		arrayBidimensional[0][5] = 5;
		arrayBidimensional[2][5] = 11;

		System.out.print("Array num   Columna 0  Columna 1  Columna 2  Columna 3");
		System.out.println("  Columna 4  Columna 5");
		for (int i = 0;i < FILAS; i++ ) {
			System.out.print("Fila " + i + "   ");
			for (int u = 0; u < COLUMNAS ; u++ ) {
				System.out.print("    " + arrayBidimensional[i][u] + "   ");
			}
			System.out.println();
		}
	}
}