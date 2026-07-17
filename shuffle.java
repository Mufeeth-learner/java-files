public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // Places x_i at 0, 2, 4...
            ans[2 * i + 1] = nums[i + n]; // Places y_i at 1, 3, 5...
        }
        
        return ans;
    }
}