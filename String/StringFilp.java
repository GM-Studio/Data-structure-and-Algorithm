package datastructure.string.stringFilp;

/**
 * 字符串翻转
 *
 * @author Squirrel-Chen
 * @DateTime 2020/1/16
 */

public class StringFilp {

    /*
     *  单个字符串的翻转
     */

    /**
     * 目标字符串数组，转换后的字符串存储数组
     */
    private static char[] descString = new char[1024];

    public static char[] stringFilp(String str) {
        descString = str.toCharArray();
        int high, low, mid = 0;
        low = 0;
        high = descString.length - 1;
        mid = descString.length / 2;
        char swap;
        for (; low <= mid && high >= mid; low++, high--) {
            swap = descString[high];
            descString[high] = descString[low];
            descString[low] = swap;
        }
        return descString;
    }

    /*
     *  多个字符串的翻转
     */

    public static String inversion(String str) {
        String result = new String();
        String[] strs = str.split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            result += strs[i] + " ";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(stringFilp("algorithm"));
        System.out.println(inversion("data and algorithm"));
    }

}
