import java.util.Scanner;

public class While2
{
  public static void main (String[] args)
  {
  int numero;
  Scanner lector = new Scanner (System.in);
  System.out.print("Escribe un numero: ");
  n = lector.Int();
  System.out.printf("El factorial del numero es %d", fact(n));

  }
  public static int fact (int num){
    int cont = 1;
    int factorial = 1;
    while (cont <= num) {
      factorial *=cont;
      cont++;
    }
    return factorial;
  }


}
