class Nstatic3
{    float b=10.5f;
	public static void main(String[]args)
	{
		Nstatic3 n3 = new Nstatic3();
		int a=n3.m1();
		float result1=n3.b+a;
		System.out.println(result1);
		
		
	}
	int m1()
	{
		int a=100;
		return a;
	
	}
}