public class tripletSortedArray {
    // Optimal Approach: Fix one element, Two Pointers for the rest
    // TC: O(n^2) | SC: O(1)
    public boolean tripletSorted(int arr[], int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                if (sum == target) {
                    return true;
                } else if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return false;
    }

}
