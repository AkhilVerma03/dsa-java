public class MinimumSizeSubarraySum {
     public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;
        while (right < n) {
            sum += nums[right];
            while (sum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }
        
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }
}
