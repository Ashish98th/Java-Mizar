import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Maxi_Min {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        // for(int tc=2;tc<=t;tc++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println(max);

            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println(min);
        //}
    }
}
































































//package Assignment;
//
//import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework
//
//// don't change the name of this class
//// you can add inner classes if needed
//class Maxi_Min {
//    public static void main (String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        // for(int tc=1;tc<3;tc++){
//            int max = Integer.MIN_VALUE;
//            int min = Integer.MAX_VALUE;
//
//            for(int i=0;i<n;i++)
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//            System.out.println(max);
//
//            for(int i=0;i<n;i++){
//                if(arr[i]<min){
//                    min = arr[i];
//                }
//            }
//            System.out.println(min);
//        }
//    }
////}