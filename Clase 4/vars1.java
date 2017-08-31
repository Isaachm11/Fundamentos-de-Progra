public class Vars1
{
	public static void main (String [] args)
	{
		//declaro variables:
		int num1;
		double num2, num3=0;

		double pi = 3.14;

		final double vdll=299792458.0;

		pi=3.14159265359;

		num3++; //operacion unaria
		++num3; //operacion unaria

		num1 = (int)pi; //cast

		num2 =(num1+num3)/2;

		//num2=num2+num1
		num2 +=num1;
		System.out.println(num1);
		System.out.println(num2);

	}
}