import java.util.Scanner;

public class Condiciones1
{
	public static void main(String[] args)
	{
		int temperatura;
		String salida;
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Escirbe temperatura del auto: ");

		temperatura = stdIn.nextInt();

		if(temperatura>=110){
			System.out.println("Temperatura muy alta. Ding Ding Ding");
			System.out.println("Detente unos minutillos");
		}
		else {
			System.out.println("La temperatura esta bien, continúa manejando");
		}

		stdIn.nextLine();
		System.out.println("escribe \"s\" para salir");
		salida = stdIn.nextLine();
		if (salida.equals ("s") || salida.equals("S") ){ //.equalsIgnoreCase
			System.out.println("Surprise Motherf****r");
		}
	}
}