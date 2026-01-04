package pkg05;

public class Recursion2 {
    public static void drawRuler(int nInches, int majorLength){
        drawLine(majorLength , 0);
        for(int j =1;j<=nInches;j++){
            drawInterval(majorLength-1);
            drawLine(majorLength,j);
        }
    }

    public static void drawLine(int tickLength, int tickLabel){
        for(int j=0; j<tickLength; j++){
            System.out.println("-");
            if(tickLabel>=0){
                System.out.print(" "+tickLabel);
            }
            System.out.print("\n");
        }

    }

    public static void drawInterval(int centralLength){
        if(centralLength>=1){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength-1);
        }
    }
    public static void drawLine(int tickL){
        drawLine(tickL,-1);
    }

    public static void main(String[]args){
        drawRuler(10, 2);
    }



}
