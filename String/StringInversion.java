public class StringInversion{

	public static String inversion(String str)
	{
		String result=new String();
		String[] strs=str.split(" ");
		for(int i=strs.length-1;i>=0;i--)
			result+=strs[i]+" ";
		return result;
	}

	public static void main(String[] args)
	{
		String str="how are you and i am fine thank you and you yes i am also fine";
		System.out.println(inversion(str));
	}

}