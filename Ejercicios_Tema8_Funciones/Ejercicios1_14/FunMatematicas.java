/**
*Librería de funciones para Java
*/

package Ejercicios1_14;

public class FunMatematicas{
  /**
  *
  */
  public static boolean esCapicua(int x){
    if ((voltea(x) == x)) {
      return true;
    }
    return false;
  }

  /**
  *Resuelve un número devolviendo 'true' o 'false' si su valor entra en el conjunto de valores primos.
  *Comprueba el conjunto de números desde 2 hasta el número anterior al introducido para saber si es solo divisible entre 1 y si mismo.
  * @param x número introducido.
  * @return 'true' o 'false' si resuelve que el número es primo.
  */
  public static boolean esPrimo(int x){
    for (int i = 2;i < x ;i++ ) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true; 
  }

  /**
  *Devuelve el primo más proximo al número entero introducido pudiendo ser el mismo número introducido.
  *Suma un valor al número introducido y comprueba si es primo hasta encontrar el siguiente primo al introducido puediendo 
  *ser el mismo número al introducido.
  *@param x número introducido.
  *@return siguiente primo del número introducido
  */
  public static int siguientePrimo(int x){
    int i = x;
    while(!esPrimo(i)){
     i++;
    }
    return i;
  }

  /**
  *Devuelve la potencia de la base introducida y su exponente.
  *Multiplica la base introducida tantas veces como su exponente indique mediante un bucle de contador su exponente.
  *@param x base del número.
  *@param y exponente del número.
  *@return potencia de la base y su exponente.
  */
  public static int potencia(int x, int y){
    int potencia = x;
    if(y == 0){
      potencia = 1;
    }else {for (int i = 1;i < y ;i++ ) {
        potencia = potencia * x;
      }
    }
    return potencia;
  }

  /**
  *Devuelve el número de dígitos de un número entero.
  *Divide el número introducido entre 10 y cuenta el número de repeticiones hasta llegar al único dígito en la parte entera del número.
  *@param x número al que se le cuentan los digitos.
  *@return número de dígitos.
  */
  public static int digitos(int x){
    int numeroDigitos = 1;
    while(x > 9){
      x = x/10;
      numeroDigitos++;
    }
    return numeroDigitos;
  }

  /**
  *Devuelve el número introducido con sus números volteados de orden.
  *@param x número al que se le voltea el orden del numero.
  *@return número volteado.
  */
  public static int voltea(int x){
    int numeroDigitos = digitos(x);
    int[] array = new int[numeroDigitos];
    int multiplica = potencia(10,(numeroDigitos-1));
    int numReturn = 0;

    for(int i = 0; i < numeroDigitos; i++){
    array[i] = x % 10;
    x = x / 10;
    }
    for(int a : array){
      numReturn += (a * multiplica);
      multiplica = (multiplica / 10);
    }
    return numReturn;
  }

  /**
  *Devulve el dígito indicado en la segunda variable, en orde de izquiera a derecha empezando desde el 0. El programa voltea el número
  *introducido y mediante un bucle empieza a recortar el número desde la derecha hasta llegar a la posición indicada y sacando el primer
  *dígito mediante el módulo del mismo, en caso de ser un número de un digito no entra en el bucle y devuelve el mismo número.
  *@param x número introducido para seleccionar un dígito.
  *@param n número que indica el dígito a seleccionar desde la izquierda empezando por 0.
  *@return dígito indicado.
  */
  public static int digitoN(int x, int n){
    int numeroVolteado = voltea(x);
    int a = x;

    for(int i = 0; i < n; i++){
    a =  numeroVolteado % 10;
    numeroVolteado = numeroVolteado / 10;
    }
    return a;
  }

  /**
  *
  */
  public static int posicionDeDigito(int x, int n){
    int numeroVolteado = voltea(x);
    boolean encontrado = true;
    int posicion = 0;

    while(encontrado){
      int a =  numeroVolteado % 10;
      numeroVolteado = numeroVolteado / 10;
      if (a == n) {
        encontrado = false;
      }else if(numeroVolteado < 0){
        encontrado = false;
        posicion = -1;
      }else{
        posicion++;
      }
    }
    return posicion;
  }
}