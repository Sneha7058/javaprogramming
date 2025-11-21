class Exp1
{
	public static void main(String[]args)
	{
		System.out.println("Show the try and catch blocks");
		try
		{
			System.out.println(10/0);
			try
			{
				System.out.println(8/0);
			}
			catch (ArithmeticException a)
			{
				System.out.println("0 not divided by 8");
			}
		}
		catch ( ArithmeticException a1)
		{
			System.out.println("0 not divided by 10");
		}
	}
}	