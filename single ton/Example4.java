class parent 
{
	 void m2()
	{
		System.out.println("Inside the parent method");
	}
}
class child extends parent
{
	 void m2()
	{
		System.out.println("Inside the child method");
	}
}
class Example4
{
	public static void main(String[]args)
	{
		parent p1 = new child();
		p1.m2();
	}
}s