package MOCK.Array;

class Negativeelement{
    public static void main(String args[]){
        int arr[]={1,-1,3,2,-7,-5,11,6};
        int newarray[] = new int[arr.length];
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                //put the value at 0th index of newarray
                newarray[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newarray[j]=arr[i];
                j++;
            }
        }

        for(int element:newarray){
            System.out.println(element+" ");
        }
    }
}