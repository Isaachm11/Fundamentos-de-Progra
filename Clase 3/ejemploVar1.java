public class ejemploVar1
{
	public static void main(String[] args)
	{
		int numero1;
		int numero2;

		numero1 = Integer.parseInt (args[0]);
		numero2 = Integer.parseInt (args[1]);

		System.out.println("la suma es "+(numero1+numero2) );
		System.out.println("la resta es "+(numero1-numero2) );
		System.out.println("la division es "+(numero1/numero2) );
		System.out.println("la multiplicacion es "+(numero1*numero2) );
		System.out.println("el modulo es "+(numero1%numero2) );
		//esto es para meter cualesquiera dos numeros cuando ya se vaya a correr
		}
}