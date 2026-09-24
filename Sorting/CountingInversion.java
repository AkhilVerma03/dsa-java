
public class CountingInversion {

    public int countInversion(int[] nums, int p, int r) {
        int res = 0;
        if (p < r) {
            int q = p + (r - p) / 2;
            res += countInversion(nums, p, q);
            res += countInversion(nums, q + 1, r);
            res += countAndMerge(nums, p, q, r);

        }
        return res;

    }

    public int countAndMerge(int[] nums, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = nums[p + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = nums[q + i + 1];
        }
        int i = 0, j = 0, res = 0, k = p;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
                res += n1 - i;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

}
