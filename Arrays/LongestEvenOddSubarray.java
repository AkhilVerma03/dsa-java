public class longest_even_odd_subarray {
    public int max_lenth(int arr[]) {
        int count = 1;
        int maxsofar = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i - 1] % 2 == 0 && arr[i] % 2 != 0)) {
                
                count++;
                maxsofar = Math.max(count, maxsofar);
            } else {
                count = 1;
            }
        }

        return maxsofar;
    }
}