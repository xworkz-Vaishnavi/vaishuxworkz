class Board
{
	public static void main(String a[])
	{
		toWrite();
		toWrite("Marker");
	}
	
	static void toWrite()
	{
		System.out.println("Writing on the board");
	}
	
	static void toWrite(String pen)
	{
		System.out.println("Writing on the board" + pen);
	}
}