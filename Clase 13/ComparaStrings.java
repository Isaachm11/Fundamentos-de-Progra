public class ComparaStrings{
  public static void main(String[] args) {
    String s1 = "arbol";
    String s2 = "barco";
    String s3 = "carro";

    int comparacion;

    comparacion = s1.compareTo(s2);
    System.out.printf("Compracion entre el string 1 y el 2 es: %d%n", comparacion);
    // Va comparando el simpolo del "utf" de cada uno y devuelve la diferencia
    /*
    + Compara primero la primer simbolo con el primero, si son iguales pasa al
    + siguiente de los dos. Si son iguales devuelve la diferencia entre los
    + primeros simbolos.
    */
    
    comparacion = s1.compareTo(s3);
    System.out.printf("Compracion entre el string 1 y el 3 es: %d%n", comparacion);

    comparacion = s3.compareTo(s2);
    System.out.printf("Compracion entre el string 2 y el 3 es: %d%n", comparacion);

  }
}
