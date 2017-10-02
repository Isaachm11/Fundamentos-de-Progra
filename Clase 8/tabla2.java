
public class tabla2{
  public static void main (String[] args){
    //cantidad de filas (horizontal)
        int fila = 10;
        //cantidad de columnas (vertical)
        int columna = 10;
        //una matriz para la tabla de multiplicar con tamaño
        //predefinido por las variables fila y columna
        int multiplicar[][] = new int[fila][columna];

        //En este primer for, rellenamos nuestra matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                multiplicar[i][j] = (i+1) * (j+1);
                //Obs: usamos (i+1) y (j+1) porque las matrices se cargan
                //a partir de la posicion 0, y si ponemos 1 al for
                //saldra error de puntero.
            }
        }

        //En este for se muestran los resultados
        //He usado un string para mostrar en forma "ordenada"
        //Lo que quieras va a depender de tu imaginacion.
        for (int i = 0; i < fila; i++) {
            String fil = "";
            for (int j = 0; j < columna; j++) {
                fil += multiplicar[i][j];
            }
            System.out.println(fil + "n");
        }
  }

}
