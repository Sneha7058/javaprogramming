class HdfcBank
{
	private int amountBal;
	HdfcBank(int amountBal)
	{this.amountBal=amountBal;
	System.out.println("Account creations is successful");}
	public int getAmountBal()
	{ System.out.println("Getting your Amount bal,please wait ....");
		return amountBal;}
		public void setAmountBal(int depAmount)
	{System.out.println("please wait .....Depositting your amount");
		if(depAmount>0)
		{amountBal=amountBal+depAmount;}
		else
		{System.out.println(" Please enter valid amount..");
		}
}
}
class Example2
{
	public static void main(String[]args)
	{
		HdfcBank cust1 = new HdfcBank(10000);
		int currentBal = cust1.getAmountBal();
		System.out.println("Current Account Balance is "+currentBal);
		cust1.setAmountBal(5000);
		currentBal=cust1.getAmountBal();
		System.out.println("Current Account Balance is "+currentBal);
	}
}