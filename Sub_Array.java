package GFGARRAYquestions;

public class Sub_Array {
    public static void subarray(int arr[], int n){
        int ts=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){ //j=i because single element vala subarray bhi vhahie
                for(int k=i; k<=j; k++){
                    System.out.print( arr[k]);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is"+ ts);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        subarray(arr,n);
    }
}
