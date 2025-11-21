class cyber 
{  float m1()
	{
		System.out.println("In side the m1 method");
		float a=100.5f;
		return a;
	}
}
class sucess
{
	  static int m2(){
		   System.out.println("In side the m2 method ");
		int b=100;
		return b;
	   }
		
}
class nstatic8
{    float var;
	public static void main(String[]args)
	{
		int var1;
		nstatic8 ref = new nstatic8();
		cyber c= new cyber();
		float a= c.m1();
		ref.var=a;
	    int b= sucess.m2();
		var1=b;
		System.out.println("Inside the main");
		float var2= ref.var+var1;
		System.out.println("ALL RESULT "+var2);
		char A=99;
		char B = 'H';
		System.out.println("char to int " + (int) B);
		System.out.println("int to char "+A);
	}
}