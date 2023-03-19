public class Task7 {

    //    String-1 > extraEnd
    //    Given a string, return a new string made of 3 copies of the last 2 chars
    //    of the original string. The string length will be at least 2.
    //    extraEnd("Hello") → "lololo"
    //    extraEnd("ab") → "ababab"
    //    extraEnd("Hi") → "HiHiHi"

    public static void main(String[] args) {
        System.out.println(extraEnd("Peace"));
    }

    public static String extraEnd(String str) {

        //Note: this code does not run on https://codingbat.com
        //showing error "cannot find symbol repeat(int)", but here it works ok.
        return str.substring(str.length() - 2).repeat(3);

        //The code below works fine on https://codingbat.com
        //String s = str.substring(str.length()-2);
        //return s+s+s;
    }
}
