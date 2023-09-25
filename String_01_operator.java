package GFG_STRING;

import java.util.ArrayList;

public class String_01_operator {
    public static void main(String[] args){
        System.out.println('a'+ 'b');  //by defult aasci value use karshe
        System.out.println("a"+"b");
        System.out.println((char)('a'+ 3)); // casting

        System.out.println("a"+1); // output a1, when integer concat with string it is converted into its wrapper class integer
                                  // integer will be converted to Integer that will call toString
        System.out.println("Rahul"+ new ArrayList<>()); // initially arraylist is empty output: Rahul[]
        System.out.println("Rahul"+ new Integer(56));  // output Rahul56

       //  System.out.println(new ArrayList<>()+new Integer(56));  // banne mathi ek to string hovu j joie
        System.out.println(new ArrayList<>()+" " +new Integer(56)); // ouput: [] 56
        // vachhe space rakhine string rakhi etle have work karashe
    }
}
