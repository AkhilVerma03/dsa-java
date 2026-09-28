public class MinumumWindowSubstring {
  public String minWindow(String s, String t) {

        int n = s.length();
        int m = t.length();

        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        int[] hash = new int[128];

        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < n) {

            if (hash[s.charAt(right)] > 0) {
                count++;
            }

            hash[s.charAt(right)]--;

            while (count == m) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    sIndex = left;
                }

                hash[s.charAt(left)]++;

                if (hash[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        if (sIndex == -1) {
            return "";
        }

        return s.substring(sIndex, sIndex + minLen);
    }  
}
