public class searchRotatedSortedArray {
    
    public int binarySearch(int low, int high, int target, int arr[]) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int method(int arr[], int target, int low, int high) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        
        else if(arr[mid] < arr[low]) {
            if(target > arr[mid] && target <= arr[high]) {
               return binarySearch(mid + 1, high, target, arr); 
            }
            else {
                
                return method(arr, target, low, mid - 1);
            }
        }
        else {
            
            if(target >= arr[low] && target < arr[mid]) {
               return binarySearch(low, mid - 1, target, arr); 
            }
            else {
                return method(arr, target, mid + 1, high);
            }
        }
    }

    public int search(int arr[] , int target){
        return method(arr, target, 0, arr.length-1);
    }
}


// optimal code 

// class Solution {
//     public int search(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target)
//                 return mid;

//             if (nums[low] <= nums[mid]) {

//                 if (target >= nums[low] && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }

//             }
//             else {

//                 if (target > nums[mid] && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }

//             }
//         }

//         return -1;
//     }
// }