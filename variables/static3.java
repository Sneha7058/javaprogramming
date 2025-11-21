class demo
{
	static int a=10;
}
class demo1
{
	float b=50.6f;
}
class result
{
	static float result1;
	
}

class static3
{
	public static void main(String[]args)
	{
		//result r1=new result(result1);
		demo1 d1=new demo1();
		result.result1=demo.a+d1.b;
		System.out.println(result.result1);
			
	}

}