package Assignment.Array.ARRAY;

public class Hip_Hip_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        int product=1;
        for(int i=arr.length-1;i>=0;i--){
            if(i%2==1){
                sum=sum+arr[i];
            }
            if(i%2==0){

                product=arr[i]*product;

            }
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
