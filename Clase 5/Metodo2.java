import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER
public class Metodo2
{
	public static void main (String[] args)
	{
		System.out.printf ("El cuadrado de %f es %f", 4.0, cuadrado(4.0));
		}

	public static double cuadrado(double numero)
	{
		double cuadrado;
		cuadrado = numero*numero;
		return cuadrado;
		}
}
