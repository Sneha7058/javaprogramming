class demo
{
	 private static demo refvar;
	 public static demo object()
	{
		 if (refvar==null)
		 {
			 refvar=new demo();
		 }
		 return refvar;
	}
}
class Example3
{
	public static void main (String[]args)
	{
		demo ref1=demo.object();
		System.out.println("Inside the main & print the address..." +ref1);
		demo ref2=demo.object();
		System.out.println("Inside the main & print the address..." +ref2);
	}
}