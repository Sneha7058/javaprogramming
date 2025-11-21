class Example2
{
	public static void main(String[]args)
	{
		String str1 = "Cyber";
		String str2 = "Success";
		String str3 = "Cyber";
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str1);
		String sb1 =new String("Cyber");
		String sb2 =new String("Success");
		String sb3 =new String("Cyber");
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb3==sb1);
	}
		
}