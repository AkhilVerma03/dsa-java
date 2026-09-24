
public class splitArrayLargestSum {

    //Time Complexity: O(N * log S) where N is array length and S is the sum of all elements
    //Space Complexity: O(1)

    public int splitArrayOptimal(int[] nums, int k) {
        int high = 0;
        int low = 0;
        for (int x : nums) {
            high += x;
            low = Math.max(low, x);
        }
        while (low <= high) {
            int cut = low + (high - low) / 2;
            int count = 1;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > cut) {
                    count++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }
            if (count <= k) {
                high = cut - 1;
            } else {
                low = cut + 1;
            }
        }
        return low;

    }

}
