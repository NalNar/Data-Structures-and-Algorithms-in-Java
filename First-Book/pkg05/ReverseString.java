/* program to reverse string recursively */
public class ReverseString {
    public static String reverseString(String s){

        // base case when s.length is 1 return s
        if(s.length() == 1){
            return s;
        }
        // last digit + shrink string 
        return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));

    }

    public static void main(String[] args) {
        String s = "hio";
        System.out.println(reverseString(s));
    }
}
