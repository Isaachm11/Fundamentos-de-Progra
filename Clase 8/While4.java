import java.util.Scanner;

public class While4{
  public static void main (String [] args){

    double lado;
    String res;
    Scanner leer = new Scanner(System.in);

    res = "si";

    while (res.equalsIgnoreCase("si")) { //por si el usuario lo pone en mayúsculas, lo baja a minúsculas
      System.out.println("Dame el lado de un cuadrado para sacar el área");
      lado = leer.nextDouble();
      leer.nextLine();
      System.out.printf("El área es %.2f %n", lado*lado);

      System.out.println("¿Quieres hacerlo de nuez?");
      res = leer.nextLine();
    }

  }
}
