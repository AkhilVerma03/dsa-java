public class binary_search_recursive {

    public int binary_recur(int arr[], int key, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (key == arr[mid])
            return mid;
        else if (key < arr[mid])
            return binary_recur(arr, key, low, mid - 1);
        else
            return binary_recur(arr, key, mid + 1, high);
    }
}