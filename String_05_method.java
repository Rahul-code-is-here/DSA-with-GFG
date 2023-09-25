package GFG_STRING;

import java.util.Arrays;

public class String_05_method {
    public static void main(String[] args){
        String name= "Rahul Chauhan hello world";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase()); // new object banshe. origanal string em nam reshe
        System.out.println(name);

        System.out.println(name.indexOf('a')); // 0 rakho to -1
        System.out.println("   Rahul   ".strip()); // vachhethi space na kadhe aaju baju banne side space kadhi nakhe

        System.out.println(Arrays.toString(name.split(" ")));
        // jyathi space hashe tyathi array divide thai jashe
    }
}
