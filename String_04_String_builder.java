package GFG_STRING;

public class String_04_String_builder {
    public static void main(String[] args){
        StringBuilder builder= new StringBuilder();
        for(int i=0; i<26; i++){
            char ch=(char) ('a'+i);
            builder.append(ch); // buider += ch jevu j kam par dar vakhate new object nai bane. te original object ma j change karashe
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
       System.out.println(builder);

       builder.reverse();
       System.out.println(builder);
    }
}
