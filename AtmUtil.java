class AtmUtil
{
	public static void main(String a[])
	{
		Atm atm = new Atm();
		atm.name="SBI";
		atm.address="gandhi nagar";
		atm.noOfBranches=7;
		System.out.println(atm.name);
		System.out.println(atm.address);
		System.out.println(atm.noOfBranches);
		atm.moneyTransactions();
	}
}