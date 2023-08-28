package GFGARRAYquestions;

public class Zig_zag {
    public static void zigzag(int arr[], int n){
        boolean flag=true;
        for(int i=0; i<n-2; i++){
            if(flag)  //  in between B and C "<" relation expected
            {
                // if we have situation A>B>C, we get A>B<C by swapping B and C
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]= temp;
                }
            }
            else // > relation expected
            {
                //if we have situation A<B<C, we get A<C>B by swapping B nad C
                if (arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag=!flag;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,6,7,8};
        int n=arr.length;
        zigzag(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
