package GFGARRAYquestions;

public class Self_duplcicate_element_find {
    public static void find_duplicate(int arr[], int n){
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(arr[i]==arr[j]){
                   System.out.println(arr[i]);
               }
           }
       }

    }
    public static void main(String[] args){
        int arr[]={2,3,1,2,3};
        int n=arr.length;
        find_duplicate(arr,n);
    }
}
