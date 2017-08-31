import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER
public class Metodo2
{
	public static void main (String[] args)
	{
		double num1 = cuadrado(5.0)
		;

		System.out.printf ("El cuadrado de %.1f es %.1f %n", 4.0, cuadrado(4.0));
		System.out.printf("%.2f %n", num1);
		imprimeHola();
		}

	public static double cuadrado(double numero)
	{
		double cuadrado;
		cuadrado = numero*numero;
		return cuadrado;
		}

		public static void imprimeHola()
		{
			System.out.printf("Hi everybody %n");
		}
}
