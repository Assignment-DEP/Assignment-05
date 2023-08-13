import java.util.Arrays;
import java.util.Scanner;

public class Algo_6 {
   
   private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        boolean flag = true;
        String sentence;
        do{
        System.out.println("Enter your Sentence with fullstop mark : ");
        sentence =scanner.nextLine().strip();
        if(sentence.isEmpty()||sentence.charAt(sentence.length() - 1)!='.')System.out.println("Sentence shouldn't be empty,only spaces or without fullstop marks.");
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
        System.out.println(names.length);
        
        int j = (names.length)/2;
        for(int i = 0; i < j; i++){
            String temp = names[i];
            names[i]=names[names.length-i-1];
            names[names.length-i-1]=temp;
            
        }
       for (int i = 0; i < names.length; i++) {
        System.out.print(names[i]+" ");
        
       }
       System.out.print("\b.\n");

    }

    
}
