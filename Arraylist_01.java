package Searching_sorting_with_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_01 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        /*list.add(1);
        list.add(20);
        list.add(30);
        list.remove(2);
        list.set(2,22); */

        // input
        for(int i=0 ; i<5; i++){
            list.add(sc.nextInt());
        }
        // print
        for(int i=0 ; i<5; i++){
           System.out.println(list.get(i));
        }
    }
}
