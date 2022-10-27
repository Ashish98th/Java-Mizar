package Assignment.Array;

public class Second_Max {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 8, 1};
        int max = 0;
        int result=max(arr,max);
        System.out.println(result);
    }

     static int max(int[] arr, int max) {

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = i;

             }
         }
         return max;
     }
}
