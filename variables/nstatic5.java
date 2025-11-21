class nstatic5
{     char x='B';
	  boolean y=true;
	public static void main(String[]args)
	{
	  
	  nstatic5 var = new nstatic5();
	  nstatic5 var1 = new nstatic5();
	  System.out.println("AFTER THE VALUE X "+var.x);
	  System.out.println("AFTER THE VALUE Y "+var1.y);
	  var.x='c';
	  var1.y=false;
	  System.out.println("BEFORE THE VALUE X "+var.x);
	  System.out.println("BEFORE THE VALUE Y "+var1.y);
	  
	  
	  
	}
}