package GFGARRAYquestions;

public class Self_find_duplicate {
    public static void duplicate(int arr[], int n){
        int j=0;
        for (int i=0; i<n; i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        for(int i=j+1; i<n; i++){
            System.out.println("repeataing numbers are: ");
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,4,5,6};
        int n=arr.length;
        duplicate(arr,n);
    }
}
