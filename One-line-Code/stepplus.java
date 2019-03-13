public class stepplus{

	public static int stepplus(int n)
	{
		return (n>=0)? n+stepplus(n-1):0;
	}

	public static void main(String[] args)
	{
		System.out.println("The result is   "+stepplus(100));
	}
}