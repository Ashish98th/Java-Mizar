//package MOCK.Array;
//
//public class Hard {
//    public static void main(String[] args) {
//        int arr[] = {12, 3, 6, 1, 6, 9};
//        int sum = 24;
//        int arr[]=triplet(arr, sum);
//    }
//
//        static int[] triplet ( int arr[], int sum){
//             int newarr[]=new int[3];
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr.length - 1; j++) {
//                    for (int k = 0; k < arr.length - 2; k++) {
//                        if (arr[i] + arr[j] + arr[k] == sum) {
//                             newarr[0]=arr[i];
//                             newarr[1]=arr[j];
//                             newarr[2]=arr[k];
//                        }else{
//                            System.out.println("No triplets can be formed");
//                        }
//                    }
//                }
//            }
//            return newarr;
//        }
//    }
//
//
