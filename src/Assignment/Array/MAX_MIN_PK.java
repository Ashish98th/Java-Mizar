package Assignment.Array;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MAX_MIN_PK {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int j=0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            int min=arr[0];
            int max=arr[0];
            for(int j=0; j<n; j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            System.out.print(max +" ");
            System.out.print(min);
            System.out.println();
        }
    }
}