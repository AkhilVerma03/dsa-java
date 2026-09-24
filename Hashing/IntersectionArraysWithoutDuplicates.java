import java.util.HashSet;

public class IntersectionArraysWithoutDuplicates {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }

        int[] ans = new int[result.size()];
        int k = 0;

        for (int nums : result) {
            ans[k] = nums;
            k++;
        }
        return ans;
    }
}
