/* to determine if the string is palindrome recursively */

public class RecPalindrome{
    public static boolean recPalindrome(String s){

        // idea is to break if front is not equal back

        // when string is <=1 then it is palindrome
        if(s.length() <= 1){
            return true;
        }
        // if the first and last doesnt add then not palindrome
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        
        // trim the last digit each time
        return recPalindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[]args){
        String s = "racecar";
        System.out.println(recPalindrome(s));
    }
}