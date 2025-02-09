class Solution {
    public int removeElement(int[] nums, int val) {
        int index = nums.length - 1;
        int k = nums.length;

        for (int i = nums.length - 1; i>= 0; i--){
            if (nums[i] == val){
                k--;
                nums[i] = nums[index];
                index--;
            }
        }
        return k;
    }
}
