import java.util.Scanner;

public class Algo_5{
    private static final Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        boolean flag = true;
        String text;
        do{
        System.out.println("Enter your text  : ");
        text =scanner.nextLine().strip();
        if(text.isEmpty()) System.out.println("text shouldn't be empty or only spaces.");
        else flag = false;
        }while(flag);
        

        char[] nums = text.toCharArray();
        int j = (nums.length)/2;
        
        for(int i = 0; i < j; i++){
        {if(nums[j-1]==' ')continue;
        char temp = nums[i];
        nums[i]=nums[nums.length-i-1];
        nums[nums.length-i-1]=temp;
       
        }        
        }
        String reverceName = "";
        for(int k = 0; k < nums.length; k++){
            reverceName+=nums[k];  
        }
        System.out.println(reverceName);

    }
}