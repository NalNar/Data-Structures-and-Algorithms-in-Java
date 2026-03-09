public class StringToInt{
    public static int stringToInt(String s){
        // when the length is 1, s.charAt(0) - '0' make it integer
        if(s.length() == 1){
            return s.charAt(0) - '0';
        }
        int firstDigit = s.charAt(0) - '0';
        
        // substring deletes from 1 to n
        return firstDigit * (int)Math.pow(10,s.length()-1) + stringToInt(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "10020";
        int z = stringToInt(s);
        System.out.println(z);
    }
}