package Searching_sorting_with_basic;

public class Searching_07_smallest_letter {
    public static int nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end=letters.length-1;

       /* if(start==letters.length){
            return letters[0];
        }*/

        while (start<=end){
            int mid= start+ (end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
    public static void main(String[] args){
      String letters[]={"c","f","j"};
      String target="j";

    }
}
