public class reverse_array {
    public static void reverse_arrays(int arr[]) {
        int end = arr.length - 1;
        int start = 0;

        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;

        }

    }

}
