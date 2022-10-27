package Assignment.Array.Sorting;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void bubblesort(int[]arr,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(arr[j+1]>arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}