import java.util.Scanner;

public class Algo_10{
    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
        String text = "" ;
        do {
            System.out.println("Enter your text :") ;
            text = scanner.nextLine() ;

        } while (text.strip().isBlank());
        text = " " + text.strip() ;
        char[] charArray = text.toCharArray() ;
        String temp = "" ;
        String invertedText = "";
        for(int i = ( charArray.length-1 ) ; i >=0  ; i--){   
            if( charArray[i] == ' ' ){ 
            invertedText=invertedText +  temp + " ";
                temp = "";
                continue ;
            }
            temp = charArray[i] + temp ; 
        }
        System.out.println(invertedText);
    }
}