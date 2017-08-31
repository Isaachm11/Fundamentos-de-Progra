public class ejemploVar2
{
	public static void main(String[] args)
	{
	Double a;
	Double b;
	Double c;
	Double d;
	Double e;

	a = Double.parseDouble(args[0]);
	b = Double.parseDouble(args[1]);
	c = Double.parseDouble(args[2]);

	d = ((-1* b+Math.sqrt(b*b-4*a*c))/2*a);
	e = ((-1* b-Math.sqrt(b*b-4*a*c))/2*a);

	System.out.println("La primera raiz es "+d);
	System.out.println("La segunda raiz es "+e);
	}
}