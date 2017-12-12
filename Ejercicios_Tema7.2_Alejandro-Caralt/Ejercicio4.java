/**
*Ejercicio4 Alejandro Caralt Caralt
*Modifica el programa anterior de tal forma que las sumas parciales y la suma
*total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
*que el ordenador se queda “pensando” antes de mostrar los números.
*/

public class Ejercicio4 {
	public static void main(String[] args) {
		final int FILAS = 5;
		final int COLUMNAS = 5;
		final int ESPACIOS = 10;
		int total = 0;
		int[][] arrayBi = new int[FILAS][COLUMNAS];


		for (int i = 0;i < FILAS ;i++ ) {
			for (int u = 0;u < COLUMNAS ;u++ ) {
				arrayBi[i][u] = (int)(Math.random() * 900 + 100);
				total += arrayBi[i][u];
			}
		}
		//Parte superior de la Tabla
		for (int c = 0;c < COLUMNAS ;c++ ) {
			for (int s = 0;s < ESPACIOS ;s++ ) {
				if ((c == 0) && (s == 0)) {
					System.out.print("┌");
				} else if ((c == (COLUMNAS - 1)) && ( s == (ESPACIOS - 1))) {
					System.out.print("─┐");
				} else if ((c < COLUMNAS) && ( s == 0)) {
					System.out.print("┬");
				} else {
					System.out.print("─");
				}
			}
		}
		System.out.println();
		//Parte interna de la Tabla
		for (int f = 0;f < FILAS ;f++ ) {
			for (int c = 0;c < COLUMNAS ;c++ ) {
				System.out.printf("│%5d%4s",arrayBi[f][c], " " ); //Rellenar Celdas de la Tabla menos la ultima fila.
			}
			System.out.print("│ Fila " + f);
			System.out.println();
			for (int c = 0;c < COLUMNAS ;c++ ) {
				for (int s = 0;s < ESPACIOS ;s++ ) {
					if (( c == 0) && (s == 0)) {
						System.out.print("├");
					} else if ((c == (COLUMNAS - 1)) && ( s == (ESPACIOS - 1))) {
						System.out.print("─┤");
					} else if ((c < COLUMNAS) && (s == 0)) {
						System.out.print("┼");
					} else {
						System.out.print("─");
					}
				}
			}
			System.out.println();
		}
		//Ultima Fila
		for (int c = 0;c < COLUMNAS ;c++ ) {
				System.out.printf("│%7s%2d","Columna", c ); //Rellenar las Celdas de la ultima Fila.
			}
			System.out.println("│ TOTAL: " + total);
		for (int c = 0;c < COLUMNAS ;c++ ) {
			for (int s = 0;s < ESPACIOS ;s++ ) {
				if ((c == 0) && (s == 0)) {
					System.out.print("└");
				} else if ((c == (COLUMNAS - 1)) && ( s == (ESPACIOS - 1))) {
					System.out.print("─┘");
				} else if ((c < COLUMNAS) && ( s == 0)) {
					System.out.print("┴");
				} else {
					System.out.print("─");
				}
			}
		}
		System.out.println();
	}
}