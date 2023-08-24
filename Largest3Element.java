package GFGARRAYquestions;
// FIND FIRST 3 MAXIMUM NUMMBER IN ARRAY
public class Largest3Element {
    public static void Largest3Elements(int arr[],int n){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third && arr[i]!=second){
                third=arr[i];
            }
        }
        System.out.println("first three largest elemeet is" + first + " "+ second+" "+ third);
        System.out.println("third largest in AMAZON,MICROSOFT,MAKE MYTRIP");
        System.out.println("Second largest in SAP LABS, ROCKSTAND");
        System.out.println("highest number in AMAZON");
    }
    public static void main(String[] args){
        int arr[]={ 10,4,3,50,23,90};
        int n=arr.length;
        Largest3Elements(arr, n);
    }
}
