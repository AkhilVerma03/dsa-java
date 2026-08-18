public class maxsubarraysum {
    public int max_subarray(int arr[]){
        int current_max = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            current_max = Math.max(arr[i]+current_max , arr[i]);
            max = Math.max(current_max,max);
        }
        return max;
    }
    
}
