import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        int[] freq = new int[128];

        for (int i = 0; i < m; i++) {
            freq[p.charAt(i)]++;
        }

        int count = 0;
        int left = 0;
        int right = 0;

        List<Integer> result = new ArrayList<>();

        while (right < n) {

            if (freq[s.charAt(right)] > 0) {
                count++;
            }

            freq[s.charAt(right)]--;
            right++;

            if (right - left > m) {
                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            if (count == m) {
                result.add(left);
            }
        }

        return result;
    }
}
