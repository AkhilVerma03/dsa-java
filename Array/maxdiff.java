public class maxdiff {
    public static int max_diff(int arr[]) {
        int min = arr[0];
        int max_diff = arr[1] - arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] - min > max_diff) {
                max_diff = arr[j] - min;
            }
            if (arr[j] < min)
                min = arr[j];

        }

        return max_diff;
    }

}
