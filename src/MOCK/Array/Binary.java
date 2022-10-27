package MOCK.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();


       int ans= binaryserach(arr, target);

    }

        private static int binaryserach(int arr[], int target){
            int start = 0;
            int end = arr.length - 1;

            int mid = 0;
            while (start < end) {
                mid = end - (end - start) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;

                }
            }
            return -1;
        }
    }

