package MOCK.Array;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        secondfunction(arr);
    }

    private static void secondfunction(int[] arr) {
        int temp[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    temp[k]=arr[j];
                    k++;
                }
            }
        }
        temp[0]=arr[0];
    }
}
