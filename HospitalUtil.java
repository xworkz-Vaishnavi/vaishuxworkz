class HospitalUtil
{
	public static void main(String a[])
	{
		Hospital hos=new Hospital();
		hos.name="Vims";
		hos.address="mg road";
		hos.noOfBranches= 5;
		System.out.println(hos.name);
		System.out.println(hos.address);
		System.out.println(hos.noOfBranches);
		hos.saveThePeople();
		
	}
}