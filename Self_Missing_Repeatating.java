package GFGARRAYquestions;

public class Self_Missing_Repeatating {
    public static void Missing_Repeating(int arr[], int n){
        for(int i=0; i<n; i++){
            if(arr[i]!=i+1){
                int missing= i+1;
                int repetating=arr[i];
                System.out.println("missing niumber is" + missing );
                System.out.println("Repeatating number is "+ repetating);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,2,4};
        int n=arr.length;
        Missing_Repeating(arr,n);
    }
}
