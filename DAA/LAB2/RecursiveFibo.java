class RecursiveFibo
{
	public static void main(String args[])
	{
		int ele;
		for(int i = 0; i < Integer.parseInt(args[0]); i++)
		{
			ele = fibo(i);
			System.out.println(ele);
		}
		
	}
	static int fibo(int n)
	{	
		int ans;
		if(n==0 || n ==1)
		{
			return n;
		}
		else
		{
			return (ans = fibo(n-1) + fibo(n-2));
		}
	}
}
