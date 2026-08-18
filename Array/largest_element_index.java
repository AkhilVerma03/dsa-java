public class largest_element_index {
    public static int largest_element(int arr[]) {
        int largest_index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest_index]) {

                largest_index=i;
            }

        }
        return largest_index;
    }

}
