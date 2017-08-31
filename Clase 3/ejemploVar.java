public class ejemploVar
{
		public static void main (String[] args)
		{
			String numero0;
			int numero1;
			int numero2;

			//Ahorita el 34 es un caracter
			numero0="34";
			//'Integer.parseInt' pasa de caracter a numero pero si le pones una letra no lo va a correr y va a dar error
			numero1= Integer.parseInt(numero0);
			numero2=23;

			System.out.println("la suma es "+(numero1+numero2) );
			System.out.println("la resta es "+(numero1-numero2) );
			System.out.println("la division es "+(numero1/numero2) );
			System.out.println("la multiplicacion es "+(numero1*numero2) );
			System.out.println("el modulo es "+(numero1%numero2) );
		}
}