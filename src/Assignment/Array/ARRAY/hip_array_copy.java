package Assignment.Array.ARRAY;
import java.util.*;
public class hip_array_copy {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        int rev[] = new int[arr.length];
        int j=0;
        for(int k=arr.length-1;k>=0;k--){
            rev[j] = arr[k];
            j++;
        }
        int sum=0;
        int product=1;
        for(int l=0;l<rev.length;l++){
            if(l%2==0){
                product=product*rev[l];

            }else{
                sum = sum+rev[l];
            }
        }
        System.out.print(sum +" ");
        System.out.println(product);
    }
}