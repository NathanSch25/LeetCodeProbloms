class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int low = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > low){
                nums[index] = nums[i];
                index++;
                low = nums[i];
                count++;
            }
        }
        return count;
    }
}