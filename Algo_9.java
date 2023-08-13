import java.util.Scanner;

public class Algo_9 {
   
   private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        boolean flag = true;
        String word;
        do{
        System.out.print("Enter your word : ");
        word =scanner.nextLine().strip();
            for (int i = 0; i < word.length(); i++)
            {
                if(word.isEmpty()||word.charAt(i)==' ')System.out.println("word shouldn't be empty or more than one word..");
                else flag = false;
            }
       
        }while(flag);

        char[] chars = word.toCharArray();
        int count = 0;

        for (int i = 0; i < (chars.length/2); i++) {
            if((chars[i]!=chars[(chars.length-1-count)])){
                System.out.println("This is not a palindrome");
                break;
            }
            else {count++;
            if(count==(chars.length/2))System.out.println("This is a palindrome");
            }        
        }  
    }
}