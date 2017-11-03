 public class Arreglo1{
  public static void main (String[] args){
    int[] arreglo = {3,5,8};
    int[] arreglo2 = new int [5];
    double acum, total;
    acum=0;
    //System.out.print(arreglo[0]); Imprime el primer número en el arreglo

    for (int i = 0; i<arreglo.length ; i++ ) {
      System.out.println(arreglo[i]);
    }
    System.out.println("Tamaño del arreglo: "+arreglo.length);
    arreglo2[0] = 95;
    arreglo2[1] = 81;
    arreglo2[2] = 70;
    arreglo2[3] = 100;
    arreglo2[4] = 65;

    for (int j = 0; j<arreglo2.length ; j++ ) {
      acum = (acum + arreglo2[j]);
    }
    total = acum/arreglo2.length;;
    System.out.println("El total es: "+total);
  }
}
/*
+ Primera clase de arreglos2
*/
