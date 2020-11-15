class AdminInfo
{
	public static void main(String dd[])
	{
		for(int info=0;info<=dd.length-1;info++)
		{
			byte adminInfo=Byte.parseByte(dd[info]);
			System.out.println(adminInfo);
		}
	}
}