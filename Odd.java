class Odd 
{
	static int One(int num)
	{
		int Sum=1;
		for (int i=0;i<=num;i++)
		{
			if (i%2!=0)
			{
				Sum=Sum+i;
				System.out.println(i);
			}
		}
		return Sum;
	}
	public static void main(String[] args) 
	{
		int y=One(20);
		System.out.println("the odd number is " +y);
	}
}
