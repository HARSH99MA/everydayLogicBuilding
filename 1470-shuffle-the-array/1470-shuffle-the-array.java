class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int left = 0;
        int right = n;
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[k] = nums[left];
            k++;
            arr[k] = nums[right];
            k++;
            left++;
            right++;

        }
        return arr;

    }
}