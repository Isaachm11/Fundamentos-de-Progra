public class CodePoint1{
  public static void main(String[] args) {
    String str;
    String compara = args[0];
    // Esto es para leer una alabra alado de cuando de corre
    // EJ: "java CodePoint1 mision"

    String nuevo;



    str = "La misión del Tec es crear personas emprendedores con sentido humano";

    if (str.contains(compara.toLowerCase()))
    // El .contains es para ver si cierto valor esta en alguna variable.
      System.out.println("Existe");
    else
      System.out.println("No existe");

    nuevo = str.replace("personas","alumnos");
    // Es para cambiera un string por otro en una frase
    System.out.println(nuevo);



    System.out.println();
    // Este "pl" lo pongo por estilo
  }
}
