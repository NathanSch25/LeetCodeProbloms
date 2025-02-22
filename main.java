import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        
        System.out.println( binarySearch(0, nums, target));
    }
    public static int binarySearch(int lower, int[] nums, int target){
        if (nums[nums.length / 2] > target){
            return binarySearch(lower, Arrays.copyOfRange(nums, lower, nums.length / 2), target);
        }

        else if (nums[nums.length / 2] < target){
            lower += nums.length/2;
            return binarySearch(lower, Arrays.copyOfRange(nums, lower, nums.length), target);
        }

        else {
            return lower + nums.length/2;
        }
    }
}
