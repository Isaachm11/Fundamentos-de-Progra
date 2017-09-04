import java.util.Scanner;

public class Codigo2 {
  public static void main (String[] args){
    int num1,num2,num3;

    Scanner stdIn = new Scanner (System.in);

    System.out.println("Dame 3 números enteros:");

    System.out.print("Primer número: ");
    num1 = stdIn.nextInt();
    System.out.println("Segundo número: ");
    num2 = stdIn.nextInt();
    System.out.println("tercer número: ");
    num3 = stdIn.nextInt();
    /* aqui va a pedir al usuario los 3 números*/

    orden(num1,num2,num3);

  }
  /*
  *Hice otra clase en donde se formula la funcion de
  * grande, mediano y chico para tenerlo más ordenado
  */
  public static void orden (int num1,int num2,int num3) {

    if (num1>num2 && num1>num3) { //num1 grande
      if (num2>num3) { //num2 mediano y num3 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num1,num2,num3);

      }
      else //num3 mediano y num2 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num1,num3,num2);

    }
    else if (num2>num1 && num2>num3){ //num2 grande
      if (num1>num3){ //num1 mediano y num3 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num2,num1,num3);
      }
      else { //num3 mediano num1 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num2,num3,num1);
      }
    }
    else { //num3 grande
      if (num1>num2) { //num1 mediano y num2 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num3,num1,num2);
      }
      else { //num2 mediano y num1 chico
        System.out.printf("El número mas grande es %f, el mediano es %f, y el más chico es %f.",num3,num2,num1);
      }

    }

  }

}
