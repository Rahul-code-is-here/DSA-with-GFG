package Searching_sorting_with_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        // initialize , jo initialize nai karie to erro aavshe, because initial value is null
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
