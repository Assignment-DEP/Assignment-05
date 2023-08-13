import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
       
        int j = (nums.length)/2;

        for (int i = 0; i < j; i++) {
            int temp = nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;  
        }
        System.out.println(Arrays.toString(nums));
    
    }
}
