public class twoPointerApproach {
    // Optimal Approach: Two Pointers
    // TC: O(n) | SC: O(1)
    public boolean pairExists(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int sum = arr[low]+arr[high];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

}