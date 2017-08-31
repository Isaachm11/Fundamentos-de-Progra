public class Vars2
{
	public static void main (String [] args)
	{
		char IN, IA,CC;

		//int, long
		//double, float
		//char, String


		IN= 'I';
		IA='M';
		CC= '\n'; // es un salto de linea.......\t es un tab
		String texto= "Mi nombre es ";
		System.out.println("Hola "+IN);
		System.out.println("Codigo: "+CC);
		System.out.println("Hola ag \rain \r"+IA); //\r se regresa al principio de la linea y reescribe
		System.out.println("el caracter 5 es "+texto.charAt(5)); //empieza a contar desde 0
	}
}
