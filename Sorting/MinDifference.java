import java.util.Arrays;

public class MinDifference {
    public int minDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        if(arr.length<2){
            return min;
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        return min;
    }
}
