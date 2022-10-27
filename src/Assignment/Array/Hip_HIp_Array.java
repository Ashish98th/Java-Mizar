package Assignment.Array;
import java.util.*;
public class Hip_HIp_Array {
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
                sum = sum+rev[l];
            }else{
                product=product*rev[l];
            }
        }
        System.out.print(sum +" ");
        System.out.println(product);
    }
}
