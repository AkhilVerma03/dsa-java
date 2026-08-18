public class max_appearing_element {
    public int method(int left[], int right[]) {
        int freq[] = new int[101];
        int max = 0;
        for (int i = 0; i < left.length; i++) {
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
            if (freq[i] > freq[max]) {
                max = i;
            }
        }

        return max;
    }

}
