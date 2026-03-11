package Recursion;
/** (String permutation) Write a recursive method to 
 * print all the permutations of a string. 
 * For example, for the string abc, the permuation  
 *<p>
 * The first method simply invokes displayPermutation(" ", s). The second
 * method uses a loop to move a character from s2 to s1 and recursively invokes
 * it with a new s1 and s2. The base case is that s2 is empty and prints s1 to the
 * console. 
 * <p>
 * 
 */

public class StringPermutations {
    public static void displayPermutation(String s){
        displayPermutation("",s);

    }
    public static void displayPermutation(String s1, String s2){
        // base case is when s2 is empty,
        if(s2.length()>0){
            for(int i = 0; i<s2.length(); i++){
                String shuffle1 = s1+s2.charAt(i);
                String shuffle2 = s2.substring(0,i) + 
                s2.substring(i+1);
                displayPermutation(shuffle1,shuffle2);
            }
        } else {
            System.out.println(s1);
        }


    }
}
