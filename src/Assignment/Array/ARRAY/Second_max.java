package Assignment.Array.ARRAY;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Second_max {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        for(int tc=0;tc<3;tc++){
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            int smax=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>smax && arr[i]<max){
                    smax=arr[i];
                }
            }
            int tmax=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>tmax && arr[i]<smax){
                    tmax=arr[i];
                }
            }
           // System.out.print(max+" ");
          //  System.out.print(smax+" ");
           System.out.println(tmax);
        }
    }
}
