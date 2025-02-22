import java.util.Arrays;
class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(0, nums, target);
    }
    public int binarySearch(int lower, int[] nums, int target){
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
