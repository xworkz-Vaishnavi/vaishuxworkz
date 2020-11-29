class AddingNumbers
{
	public static void main(String a[])
	{
		int output = add();
		System.out.println(output);
		double ans = add(567,34.55);
		double ansForThree = add(567,123,89);
		System.out.println(ans);
		System.out.println(ansForThree);
	}
	
	static int add()
	{
		int a=10;
		int b=34;
		int c = a+b;
		return c;
	}
	
	static double add(double subjectOne , double subjectTwo)
	{
		double finalData = subjectOne+subjectTwo;
		System.out.println();
		return finalData;
	}
	
	static double add(double subjectOne , double subjectTwo , double subjectThree)
	{
		double finalData = subjectOne+subjectTwo+subjectThree;
		System.out.println();
		return finalData;
	}
}