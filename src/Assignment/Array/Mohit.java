package Assignment.Array;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Mohit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int naturalsum = ((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int missingnumber = naturalsum-sum;
        System.out.println(missingnumber);
    }
}