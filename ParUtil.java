class ParlourUtil
{
	public static void main(String a[])
	{
		Parlour par = new Parlour();
		par.name="Surabi";
		par.address="Ballari";
		par.price=2000;
		System.out.println(par.name);
		System.out.println(par.address);
		System.out.println(par.price);
		par.makeUp();
	}
}