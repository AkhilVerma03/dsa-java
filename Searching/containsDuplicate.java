import java.util.HashSet;

public class containsDuplicate {
    
    // OPTIMAL SOLUTION: HashSet Lookup
    // Time Complexity: O(n) - Lightning fast CPU time
    // Space Complexity: O(n) - Trades memory for speed

    public boolean containsDuplicateOptimal(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    // NAIVE (SPACE-OPTIMIZED) SOLUTION: Sorting
    // Time Complexity: O(n \log n) - Slower CPU time
    // Space Complexity: O(1) - Takes zero extra memory


    /*
    public boolean containsDuplicateNaive(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
        */
}
