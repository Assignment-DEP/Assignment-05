import java.util.Arrays;
import java.util.Scanner;

public class Algo_7 {
   
   private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        boolean flag = true;
        String sentence;
        do{
        System.out.println("Enter your Sentence and end it with fullstop mark : ");
        sentence =scanner.nextLine().strip();
        if(sentence.isEmpty()||sentence.charAt(sentence.length() - 1)!='.')System.out.println("Sentence shouldn't be empty,only spaces \nor without fullstop mark at the end.");
        else flag = false;
        }while(flag);

        char[] chars = sentence.toCharArray();
        char[] word = new char[0];
        int b = 0;
        int c = 0;
        String[] names = new String[0]; 
        for (int i = 0; i < chars.length; i++) {

            if((chars[i]==' ')||chars.length-1==i){
                             
                String text = "";
                for(int k = 0; k < b; k++){
                text+=word[k];
                }
                word =new char[0];
                names = Arrays.copyOf(names,names.length+1);
                names[c] = text;
                c++;
                b=0;
                continue;

            }
            else{
                word = Arrays.copyOf(word, word.length+1);
                word[b]=chars[i];
                b++;
            }
            
        }
        
        int longestWordLength = names[0].length();
         
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()>longestWordLength){
                longestWordLength=names[i].length();
            }    
        }
        int count = 0;
        String longestWords = "";
        for (int i = 0; i < names.length; i++) {
            if(longestWordLength==names[i].length()){
                longestWords+= names[i]+", ";
                count++;

            }
            
        }
        if(count>1){
            System.out.println("Longest words length is : "+longestWordLength);
            System.out.println("Longest words are "+longestWords+"\b\b.");}
        else {
            System.out.println("Longest word length is : "+longestWordLength);
            System.out.println("Longest word is "+longestWords+"\b\b.");}

         int shotestWordLength = names[0].length();
         
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()<shotestWordLength){
                shotestWordLength=names[i].length();
            }    
        }
        count = 0;
        String shotestWords = "";
        for (int i = 0; i < names.length; i++) {
            if(shotestWordLength==names[i].length()){
                shotestWords+= names[i]+", ";
                count++;

            }
            
        }
        if(count>1){
            System.out.println("Shortest words length is : "+shotestWordLength);
            System.out.println("Shortest words are "+shotestWords+"\b\b.");}
        else {
            System.out.println("Shortest word length is : "+shotestWordLength);
            System.out.println("Shortest word is "+shotestWords+"\b\b.");}
        
    }

    
}
