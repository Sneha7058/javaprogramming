class cyber
{
	int a=40;
	int b=50;
}
class Nstatic7
{      int a=40;
       int b=60;
	public static void main(String[]args)
	{
		Nstatic7 var = new Nstatic7();
		cyber c = new cyber();
		  int result = c.a+c.b;
		  int result1 = var.a+var.b;
		  System.out.println("CLASS CYBER RESULT "+result);
		  System.out.println("Inside the main class result "+result1 );
	}
		
}