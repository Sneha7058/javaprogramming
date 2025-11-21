class Example21
{
	public static void main(String[]args)
	{
		System.out.println(10/0);
	}
}
//It is the throws the  run time  exceptions -> ArithmeticException
//Exception in thread "main" java.lang.ArithmeticException: / by zero  at Example21.main(Example21.java:5)