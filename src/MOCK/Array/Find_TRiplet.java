package MOCK.Array;

public class Find_TRiplet {
    public static void main(String[] args) {
        int arr[]={12,3,4,1,6,9};
        int sum = 24;
        boolean ans=tripletsum(arr,sum);
        System.out.println(ans);
    }

     static  boolean tripletsum(int[] arr, int sum) {
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;i<arr.length-1;j++){
                for(int k=j+1;i<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
