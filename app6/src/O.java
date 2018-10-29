class O 
{
	static int x=20;
	static void test()
	{
		x=60;
	}
	public static void main(String[] args) 
	{
		System.out.println("main"+x);
		test();
		System.out.println("main"+x);
	}
}
