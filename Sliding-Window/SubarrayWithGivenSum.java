public class subarraywithgivensum {
    public boolean method(int[] arr, int sum) {
    int current_sum = arr[0];
    int j = 0;

    for (int i = 1; i < arr.length; i++) {
        while (current_sum > sum && j < i) {
            current_sum -= arr[j];
            j++;
        }

        if (current_sum == sum) {
            return true;
        }

        current_sum += arr[i];
    }

    return current_sum == sum;
}
    }
    

