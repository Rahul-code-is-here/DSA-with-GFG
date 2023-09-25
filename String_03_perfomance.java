package GFG_STRING;

public class String_03_perfomance {
    public static void main(String[] args){
        String series= "";
        for(int i=0; i<26; i++){
            char ch= (char)('a'+ i);
           // System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
        System.out.println("a"+ 'a'); // jo ek string hashe to bijane be string ma convert kari deeshe

        // aa afficient solution nathi because badi vakhate a pachi ab pachi abc pachi abcd aavi
        // rite badhi vakhate new object banashe je waste of space che
        // 1+2+3+4+..+N etle O(N) time but we add String itself etle  O(N^2) time complexity

        // aana solution mate string builder no use thai je badhi vakhate new object nai banave
    }
}
