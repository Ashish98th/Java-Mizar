package Assignment.Array;
import java.util.*;
public class Merging {
    public static void main(String args[]) {
        int arr1[] = {5, 5, 9, 11};
        int arr2[] = {9, 11, 13};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
                 set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

    }
}
