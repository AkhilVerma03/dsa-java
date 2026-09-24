public class Delete {
    public static int delete_element(int arr[], int value, int size) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) {
                break;
            }
        }

        if (i==size) {
            System.out.println("element is not present in array");
            return size;
        }

        for (int j = i; j < size-1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;


        return size;
    }

}
