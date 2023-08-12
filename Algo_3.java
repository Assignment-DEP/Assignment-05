import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] oppositeNUms = new int[nums.length];
        int j = nums.length-1;

        for (int i = 0; i < oppositeNUms.length; i++) {
            oppositeNUms[i]=nums[j];
            j--;
            
        }
        nums = oppositeNUms;
        System.out.println(Arrays.toString(nums));
    
    }
}
