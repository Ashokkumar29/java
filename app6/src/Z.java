class Z
{
	static int x;
	static int y=59;
	static int z=x+y+++--x;
	static int test()
	{
		return x;
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
