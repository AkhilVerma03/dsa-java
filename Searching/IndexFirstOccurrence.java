public class index_first_occurence {
    //MY VERSION
    public int firstOccur(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                if (mid == 0 || arr[mid - 1] != key)
                    return mid;
                high = mid - 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}


//COMMON VERSION

// public int firstOccur(int[] nums, int target) {
//     int low = 0, high = nums.length - 1;
//     int ans = -1;

//     while (low <= high) {
//         int mid = low + (high - low) / 2;

//         if (nums[mid] == target) {
//             ans = mid;
//             high = mid - 1;    // keep searching left
//         } else if (nums[mid] < target) {
//             low = mid + 1;
//         } else {
//             high = mid - 1;
//         }
//     }

//     return ans;
// }