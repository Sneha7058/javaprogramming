class demo
{
	private static demo mTicket;
	private static boolean bookstatus = false;
	private demo()
	{
		System.out.println(" Wlecome the pvr cinemas...!!!");
	}
	public static demo bookpvrTicket()
	{
		System.out.println("Ticket Booking is in progress.....please wait");
		if (bookstatus==false)
		{  mTicket=new demo();
		   bookstatus=true;
		}
		return mTicket;
	}
}

class Example1
{
	public static void main(String[]args)
	{
		demo custTicket1=demo.bookpvrTicket();
		System.out.println("Your Ticket id is "+custTicket1);
		demo custTicket2=demo.bookpvrTicket();
		System.out.println("Your Ticket id is "+custTicket2);
	}
}