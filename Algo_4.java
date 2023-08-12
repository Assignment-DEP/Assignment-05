import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
       
        int j = (nums.length-1)/2;

        for (int i = 0; i < j; i++) {
            int temp = nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;  
        }
        System.out.println(Arrays.toString(nums));
    
    }
}
