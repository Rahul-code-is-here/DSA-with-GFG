package Recursion_In_Java;

public class Recursion_10 {
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n--); // aa pela n ni value pass karashe and jyare function over thashe pachi substract thashe
        fun(--n);// aa pela substract j kari nakhashe pachi value pass karashe
    }
    public static void main(String[] args){

    }
}
