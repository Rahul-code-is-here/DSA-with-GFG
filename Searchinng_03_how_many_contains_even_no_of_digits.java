package Searching_sorting_with_basic;

public class Searchinng_03_how_many_contains_even_no_of_digits {
    public static int findNumbers(int[] nums){
        int count=0;
        for( int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //funnction to check wether a number contains even digits or not
    public static boolean even(int num){
        int numberOfDigits= digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        else {
            return false;
        }
        //return numberOfDigits %2==0;
    }

    // count numbers of digits in a number
    public static int digits(int num){
        if(num<0){  //negatoive ne positive ma convert karo
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static int digits2(int num){
        if(num<0){
            num=num* -1;
        }
        return (int)(Math.log10(num)) + 1;  //short cut, jo binary ma gotva hoy to log2, otal  mate log 8
    }
    public static void main(String[] args){
         int nums[]={12,345,2,6,7896};
         System.out.println(findNumbers(nums));

    }
}
