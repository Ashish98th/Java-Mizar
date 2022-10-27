package PATTERN;

 import java.io.*; // for handling input/output
         import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 public class cpy_rt {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();

        for(int row=1;row<=h;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}