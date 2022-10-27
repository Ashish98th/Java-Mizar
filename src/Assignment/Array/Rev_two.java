package Assignment.Array;
import java.util.Scanner;
public class Rev_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            System.out.println(arr[i] + arr[i+1]);
        }
    }
}
