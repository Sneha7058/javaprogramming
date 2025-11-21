class Example13
{
	public static void main(String[]args)
	{
		String str = "Sneha kolhe";
		//Contains methods
		System.out.println(".........Contains methods.....");
		System.out.println(str.contains("eha"));
		//isEmpty methods
		System.out.println(".........isEmpty methods.....");
		System.out.println(str.isEmpty()+" -> It is the not empty string");
		String str1= "";
		System.out.println(str1.isEmpty()+ " -> It is the empty string" );
		//startstwith methods
		System.out.println(".........StartWith  methods.....");
		System.out.println(str.startsWith("Sneh"));
		System.out.println(str.startsWith("neh"));
		//endswith methods
		System.out.println(".........endWith  methods.....");
		System.out.println(str.endsWith("lhe"));
		System.out.println(str.endsWith("khe"));
		
		
	}
}
//public boolean contains(char sequance)
//public boolean isEmpty()
//public boolean startsWith(string)
//public boolean endsWith(String)