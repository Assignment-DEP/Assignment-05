import java.util.Scanner;


public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        boolean flag = true;
        int yourNumber=0;
        do{
            System.out.println("Enter your number : ");
            try
            {
                yourNumber = scanner.nextInt();   
                
                if(yourNumber>0)
                    {flag = false;
                    System.out.println("Your number is "+yourNumber+". \nValid input.");
                    }
                else System.out.println("Not a positive Number ");;
                
            }
            catch(Exception e){
                System.out.println("Not an integer value...");
            }
            scanner.nextLine();     
        }while(flag);
        
        int a = 0;
        int b = 1;
        int sum = 0;
        int c = 3;
        String values = "0, 1, ";
        do{
            sum=a+b;
            a=b;
            b=sum;
            c++;
            values += sum+", "; 
            if(c==(yourNumber+1)){break;}
            
        }while(true);
        System.out.println("fibonacci series value up to "+yourNumber+" numbers are "+values+"\b\b ");
    }
}