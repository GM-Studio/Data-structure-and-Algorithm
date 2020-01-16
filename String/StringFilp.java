package datastructure.string.stringFilp;

/**
 *   字符串翻转
 *
 * @author Squirrel-Chen
 * @DateTime 2020/1/16
 */

public class StringFilp {

     /**
     *   目标字符串数组，转换后的字符串存储数组
     */
    private static char[] descString=new char[1024];

    public static char[] stringFilp(String str)
    {
        descString=str.toCharArray();
        int high,low,mid=0;
        low=0;
        high=descString.length-1;
        mid=descString.length/2;
        char swap;
        for(;low<=mid&&high>=mid;low++,high--)
        {
            swap=descString[high];
            descString[high]=descString[low];
            descString[low]=swap;
        }
        return descString;
    }

    public static void main(String[] args)
    {
        System.out.println(stringFilp("algorithm"));
    }

}
