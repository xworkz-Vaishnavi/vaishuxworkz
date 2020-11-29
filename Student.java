class Student 
{
	public static void main(String a[])
	{
		double marks=64;
		if(marks<35)
		{
			System.out.println("student failed");
		}
		else if(marks>35 && marks<50)
		{
			System.out.println("Student failed");
		}
		else if(marks>50 && marks<60)
		{
			System.out.println("Student failed");
		}
		else if(marks>60 && marks<85)
		{
			System.out.println("Student passed with distinction");
		}
		else if(marks>85 && marks<100)
		{
			System.out.println("Student passed");
		}
	}
	
}