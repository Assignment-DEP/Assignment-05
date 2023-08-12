public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        int largestNumber = nums[0];
        int lowerstNumber = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(largestNumber<nums[i]){
                largestNumber = nums[i];
            } 
             if(lowerstNumber>nums[i]){
                lowerstNumber = nums[i];
            }            
        }
        System.out.println(largestNumber);
        System.out.println(lowerstNumber);
    }
    
}
