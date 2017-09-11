import java.util.Scanner;

public class While3
{
  public static void main (String [] args)
{
  int numero;
  Scanner lector = new Scanner(System.in);
  numero = lector.nextInt();
  System.out.printf("La sumatoria es : %d%n", sumatoria(numero));
  System.out.printf("El factorial es : %d%n", factorial(numero));
}
public static int sumatoria (int num){
  int cont = 0;
  int suma = 0;
  while (cont <= num) {
      suma = suma + cont;
      cont ++;
  }
  return suma;
  }

public static int factorial (int num){
  int contador=1;
  int fact=1;
  while (contador<=num) {
    fact *= contador;
    contador ++;

  }
  return fact;

}

}
