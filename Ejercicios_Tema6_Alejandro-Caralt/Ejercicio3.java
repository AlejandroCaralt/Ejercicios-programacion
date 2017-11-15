/**
*Ejercicio2 Alejandro Caralt Caralt
*Realiza un programa que muestre al azar el nombre de una carta de la
*baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
*diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
*cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
*sería el 1). Para convertir un número en una cadena de caracteres podemos
*/
public class Ejercicio2 {
  public static void main(String[] args) {
    int carta = ((int)(Math.random()*56)+1);
    System.out.print("Tu carta aleatoria es el ");
    switch (carta) {
      case(1):
      System.out.print("🂡");
      break;
      case(2):
      System.out.print("🂢");
      break;
      case(3):
      System.out.print("🂣");
      break;
      case(4):
      System.out.print("🂤");
      break;
      case(5):
      System.out.print("🂥");
      break;
      case(6):
      System.out.print("🂦");
      break;
      case(7):
      System.out.print("🂧");
      break;
      case(8):
      System.out.print("🂫");
      break;
      case(9):
      System.out.print("🂭");
      break;
      case(10):
      System.out.print("🂮");
      break;

      case(11):
      System.out.print("🂱");
      break;
      case(12):
      System.out.print("🂲");
      break;
      case(13):
      System.out.print("🂳");
      break;
      case(14):
      System.out.print("🂴");
      break;
      case(15):
      System.out.print("🂵");
      break;
      case(16):
      System.out.print("🂶");
      break;
      case(17):
      System.out.print("🂷");
      break;
      case(18):
      System.out.print("🂻");
      break;
      case(19):
      System.out.print("🂽");
      break;
      case(20):
      System.out.print("🂾");
      break;

      case(21):
      System.out.print("🃁");
      break;
      case(22):
      System.out.print("🃂");
      break;
      case(23):
      System.out.print("🃃");
      break;
      case(24):
      System.out.print("🃄");
      break;
      case(25):
      System.out.print("🃅");
      break;
      case(26):
      System.out.print("🃆");
      break;
      case(27):
      System.out.print("🃇");
      break;
      case(28):
      System.out.print("🃋");
      break;
      case(29):
      System.out.print("🃍");
      break;
      case(30):
      System.out.print("🃎");
      break;

      case(31):
      System.out.print("🃑");
      break;
      case(32):
      System.out.print("🃒");
      break;
      case(33):
      System.out.print("🃓");
      break;
      case(34):
      System.out.print("🃔");
      break;
      case(35):
      System.out.print("🃕");
      break;
      case(36):
      System.out.print("🃖");
      break;
      case(37):
      System.out.print("🃗");
      break;
      case(38):
      System.out.print("🃝");
      break;
      case(39):
      System.out.print("🃝");
      break;
      case(40):
      System.out.print("🃞");
      break;
    }
    System.out.println();
  }
}