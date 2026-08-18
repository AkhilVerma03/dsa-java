public class maxconsecones {
    public static int cosecone(int arr[]) {
        int count = 0;
        int max_consecutive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max_consecutive = Math.max(max_consecutive, count);
            } else {
                count = 0;
            }
        }

        return max_consecutive;
    }
}
