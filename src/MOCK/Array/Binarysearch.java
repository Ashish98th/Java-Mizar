package MOCK.Array;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
        int ans=binary(arr,target);
        System.out.println(ans);
    }

     static int binary(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid=end-(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
