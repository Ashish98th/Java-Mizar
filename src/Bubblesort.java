

public class Bubblesort {
    public static void main(String[]args){
        int arr[]={5,4,6,3,2,89,78};
    bubblesort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    }

     static void bubblesort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

}
