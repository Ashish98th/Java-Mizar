//Good buildings

package TEST;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Good_Buildings  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={3,7,4,1,2,1};
      /*  int n = sc.nextInt();
        int arr[] = new int[n]; */

       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }*/
       // for(int i=0;i<arr.length-1;i++){
        int sum=0;
        for(int i=0;i<arr.length-1;i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    sum=arr[i];

                }
            }
        }
       // }
        System.out.println(sum+" ");
        System.out.println(arr[arr.length-1]);
    }
}
