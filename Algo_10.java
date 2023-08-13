import java.util.Scanner;

public class Algo_10{
    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

       boolean flag; 
   
       do{
        flag = false;
        System.out.print("Enter your number :");
        String number = scanner.nextLine().strip();

        if(number.isBlank()){System.out.println("Telephone number can't be empty");
                                flag = true;}
                            
        else{
          char[] chars = number.toCharArray();
            if(number.length()==11 && chars[0]=='0' && number.charAt(3)=='-'){
                for (int i = 1; i < 10; i++) {
                    if(i==3) continue;
                    if(Character.isDigit(chars[i])) {
                        if(i == 9)System.out.println("Number is validated.");
                        continue;}
                     else {System.out.println("Invalid phone number.");
                            break; }   
                }
            }
            else if (number.length()==15 && number.startsWith("+94") && number.charAt(3)==' '&& number.charAt(6)==' '&& number.charAt(10)==' '){
                for (int i = 4; i < 15; i++) {
                    if(i==6 || i==10) continue;
                    if(Character.isDigit(chars[i])) {if(i == 14){System.out.println("Number is validated.");
                                                    continue;}}
                    else {System.out.println("Invalid phone number.");
                            break; }  
                }
            }
            else System.out.println("Invalid phone number.");
        }
        }while(flag);
    }
 }

