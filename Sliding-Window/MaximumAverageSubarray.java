public class MaximumAverageSubarray {
    public double findMaxAverage(int[] arr, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
