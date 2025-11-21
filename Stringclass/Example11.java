class Example11
{
	public static void main(String[]args)
	{
		String str = "SNEHA";
		//str.reverse();
		System.out.println(str);
		//String to StringBuffer
		System.out.println("String to StringBuffer");
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println(str1);
	}
}