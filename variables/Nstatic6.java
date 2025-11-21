class Nstatic6
{
	int a=5;
	int b=6;
	public static void main(String[]args)
	{
		Nstatic6 var = new Nstatic6();
		int result = var.a+var.b;
		System.out.println("Non static method Result is " + result);
		int  result1=var.m1();
		System.out.println("M1 method RESULT is "+result1);
		
		  
	}
		  
		  int m1(){
			  int a=50;
			  int b=50;
		int result1=a+b;
		return result1;
		  }
		
}