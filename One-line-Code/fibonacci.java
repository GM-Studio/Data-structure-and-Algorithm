public class fibonacci{

	public static int fabonacci(int n)
	{
		return (n<0)? 0:((n<3)? 1:fabonacci(n-2)+fabonacci(n-1));
	}

	public static void main(String[] args)
	{
		for (int i=1;i<=10 ;i++) {
			System.out.print(fabonacci(i)+"\t");
		}
	}

}