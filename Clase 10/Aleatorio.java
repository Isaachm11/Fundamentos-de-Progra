import java.util.Random;

public class Aleatorio{
  public static void main(String[] args) {
    Random nA = new Random();
    int num;

    for (int i = 1;i<=5 ;i++ ) {
      num = nA.nextInt(10)+1;
      //el "+1" es para que tambien cuente el 10 xq empieza a contar desde el 0
      /*
      + si quiero que cuente del -10 al 10:
      + num = nA.nextInt(21)-10;
      */
      System.out.println("El número es: "+num);
    }

    double numD;
    for (int i = 1;i<=5 ;i++ ) {
      numD = nA.nextDouble()*10;
      /*
      + el 10 es para que sea del 0 al 9.999999
      + porque el random double no se puede especificar y va del 0 al .99999
      + al multiplicarlo por del 10 le dar otro rango
      */
      System.out.printf("%.2f   ",numD);
    }
    System.out.println();
  }
}
