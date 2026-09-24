public class SecondLargestIndex {

    public static int secondLargestIndex(int arr[]) {

        int largest = 0;
        int second = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[largest]) {
                second = largest;
                largest = i;
            }
            else if (arr[i] != arr[largest] &&
                    (second == -1 || arr[i] > arr[second])) {
                second = i;
            }
        }

        return second;
    }
}