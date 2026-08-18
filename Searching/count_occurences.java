class count_occurences {
    public int binarySearch(int[] nums, int target, boolean first) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (first)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int ocur(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        if (first == -1)
            return 0;
        return (last - first + 1);

    }

}