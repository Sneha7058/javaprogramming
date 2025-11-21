class Example12
{
	public static void main(String[]args)
	{
		StringBuffer str = new StringBuffer("Sneha Kolhe");
		System.out.println(str);
		//StringBuffer to String
		//1 Approach Constructor
		  String str1 = new String (str);
		  //System.out.println(str1.reverse());
		  System.out.println("This is the string "+str1);
		  //2Approach tostring() methods 
		  String str2 = str.toString();
		   //System.out.println(str1.reverse());
		  System.out.println("This is the string "+str2);
	}
}