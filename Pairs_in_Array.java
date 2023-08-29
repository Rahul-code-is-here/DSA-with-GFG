package GFGARRAYquestions;

public class Pairs_in_Array {
    public static void pairs(int arr[], int n){
        int tp=0;   //fomlula=n*(n-1)/2;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println("("+ arr[i] +","+ arr[j] + ")");
                tp++;
            }
        }
        System.out.println("total pairs are"+ tp);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        pairs(arr,n);
    }
}
