/*
Ejemplo de uso de metodos
por IH
*/
import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER
public class Metodo1
{
	public static void main (String[] args)
	{

		String nombre, apellido, edad;


		Scanner lector = new Scanner (System.in);

		System.out.print("Dame tu nombre:");
		nombre = lector.nextLine();

		System.out.print("Dame tu apellido:");
		apellido = lector.nextLine();

		System.out.print("Dame tu edad:");
		edad = lector.nextLine();

		imprime(nombre, apellido, edad);

	}

	public static void imprime (String nombre, String apellido, String edad)
	{
			System.out.printf("Hola %s %s, tienes %s años   %n", nombre, apellido, edad);
			/***
			*el %s espera a un string para poder imprimnirlo
			*el %n es para hacer un salto de linea
			***/
	}

}