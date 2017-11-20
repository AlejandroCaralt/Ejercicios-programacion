/**
*Ejercicio9 Alejandro Caralt Caralt
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24. El programadeberádeciralfinalcuántosnúmerossehangenerado.
*/
public class Ejercicio9{
    public static void main(String[] args) {
        int contador = 0;
        int numeroCorrecto = 24;
        double random = 0;
        do {
            random = Math.random() * 100;
            System.out.print((int)random);
            System.out.print(" - ");
            contador++;
        } while((int)random != numeroCorrecto);
        System.out.print("Intentos: " + contador + "\n");
    }
}