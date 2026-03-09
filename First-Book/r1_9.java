import static java.lang.System.out;

public class r1_9 {
    public static String removePunc(String s){
        StringBuilder newS = new StringBuilder();
        // to remove the punc, if punc is found do nothing and continue else add it to the new string
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ',' && c != '!' && c != '\'' && c != '!' && c!='.'){
                newS.append(c);
            }
        }

        return newS.toString();
    }

    public static void main(String[] args) {
        String s = "Hi There!, John Doe";
        out.println(removePunc(s));
    }
}
