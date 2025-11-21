class Example19
{
	public static void main(String[]args)
	{
		//equals() or equalsIngonreCase()
		String str1 = "Sneha"; String str2 = "sneha";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		//compareTo() or compareToIgnoreCase()
		String str3 = "Sneha"; String str4 = "sneha";String str5 = "Kolhe ";
		System.out.println(str3.compareTo(str4));
		System.out.println(str5.compareTo(str3));
		System.out.println(str3.compareToIgnoreCase(str4));
		System.out.println(str5.compareToIgnoreCase(str3));
	}
}