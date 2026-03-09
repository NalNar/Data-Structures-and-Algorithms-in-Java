public class r1_8 {
    
    public static int vowelCounter(String s){
        int counter = 0;
        // make a switch statement for each s?
        for (int i = 0; i < s.length(); i++) {
            switch(Character.toLowerCase(s.charAt(i))){
                case 'a':counter++;
                    break;
                case 'e':counter++;
                    break;
                case 'i':counter++;
                    break;
                case 'o': counter++;
                    break;
                case 'u':counter++;
                    break;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        String s = "Lorem ipsum idor et";
        System.out.println(vowelCounter(s));
    }
}
