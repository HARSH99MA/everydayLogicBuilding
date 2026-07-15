class Solution {
    public int searchInsert(int[] nums, int target) {
        int found = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = i;
            }
            else if(nums[i] < target){
                found = i+1;
            }
            else if(target > nums[i]){
                found = i + 1;
            }
           
        }
        return found;
    }
}