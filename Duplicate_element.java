package GFGARRAYquestions;

public class Duplicate_element {
    public static int removeDUPLICATE(int arr[], int n){
    int j=0;
    for(int i=0; i<n; i++){
        if(arr[j]!=arr[i]){
            arr[++j]=arr[i];
        }
    }
        //System.out.println(j+1);
   /* for(int i=0; i<j+1; i++){
        System.out.println(arr[i]);
    } */
    return j+1;

    }
    public static void main(String[] args){
        int arr[]={1,2,2,4};
        int n=arr.length;
        removeDUPLICATE(arr,n);
    }
}
