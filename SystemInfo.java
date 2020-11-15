class SystemInfo
{
	public static void main(String rr[])
	{
		for(int info=0;info<=rr.length-1;info++)
		{
			short systemInfo=Short.parseShort(rr[info]);
			System.out.println(systemInfo);
		}
	}
}