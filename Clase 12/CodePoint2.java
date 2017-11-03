public class CodePoint2{
  public static void main(String[] args) {
    String str;
    int val1;

    str = "Niño 𝒫";
    System.out.printf("El CodePoint es: %d%n", str.codePointAt(5));
  }
}
