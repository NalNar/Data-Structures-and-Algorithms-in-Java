package Recursion;

public class SequenceN {

    public static void sequence(int n, String current){

        // base case
        if(current.length() == n){
            System.out.println(current);
            return;
        }

        // try digits 0–9
        for(int i = 0; i <= 9; i++){
            if(current.length() == 0 && i == 0)
                continue; // skip leading zero

            sequence(n, current + i);
        }
    }

    public static void main(String[] args) {
        sequence(2, "");
    }
}