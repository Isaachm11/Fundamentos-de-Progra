public class recursivo2{
  public static void main(String[] args) {
    String nombre = "Isaac";

    words(nombre);
    System.out.println();
  }

  public static void words(String n){
    if (n.length()<=1) {
      System.out.print(n+"\t");
    }

    else {
      System.out.print(n+"\t");
      words(n.substring(0,n.length()-1));
      System.out.print(n+"\t");
    }
  }
}
