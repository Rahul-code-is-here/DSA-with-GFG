package GFGARRAYquestions;

public class self_zig_zag_sequence {
    public static void sequence(int arr[], int n){
        int temp=0;
        int i=0;
        if(n%2==0);
        else n=n-1;
        while(i<n){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        sequence(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
