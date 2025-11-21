class static2
{    static int a=10;
      static float b=10.5f;
	public static void main(String[]args)
	{
		//Directly
		float s1=a+b;
		//class name
		float s2=static2.a+static2.b;
		//object creation
		static2 s4=new static2();
		float s3= s4.a+s4.b;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
		
}