class K 
{
	static int i=24;
	public static void main(String[] args) 
	{
		int i=40;
		System.out.println(K.i);
		System.out.println(i);
		K.i=500;
		i=600;
		System.out.println(K.i);
		System.out.println(i);
	}
}
