package GFG_STRING;

public class String_06_palindrom {
    //O(N) time complexity
    public static boolean isPalindrome(String str){
        if( str==null || str.length()==0 ){ // null pela nai rakhie to error
            return true;
        }
        str=str.toLowerCase();
        //array ma length of variable tethi () jarur nathi .length pachi
        for(int i=0; i<str.length()/2; i++){ //length of function or method that's why length pachi (). internally is also working as array
            char start=str.charAt(i);
            char end= str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
     // String str="abcdcba";
        String str=null;
      System.out.println(isPalindrome(str));
    }
}
