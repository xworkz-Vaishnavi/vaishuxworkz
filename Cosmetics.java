class Cosmetics
{
	static double price;
	String name;
	String color;
	String brand;
	String id;
	
	void makeOver()
	{
		System.out.println("party makeover");
	}
	
	public static void main(String a[])
	{
		Cosmetics cos = new Cosmetics();
		cos.price=300;
		cos.name="Lakme sketch";
		cos.color="Black";
		cos.id="Lak456";
		System.out.println(cos.price);
		System.out.println(cos.name);
		System.out.println(cos.color);
		System.out.println(cos.brand);
		System.out.println(cos.id);
		cos.makeOver();
	}
}