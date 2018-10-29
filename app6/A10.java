class A10
{
	static int i=20;
	public static void main(String[] args) 
	{
		int i=40;
		System.out.println(A10.i);
		System.out.println(i);
		A10.i=200;
		i=400;
		System.out.println(A10.i);
		System.out.println(i);

	}
}
