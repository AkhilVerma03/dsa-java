public class EquilibriumPoint {
    // public static boolean method(int[] arr) {
    // if (arr == null || arr.length == 0) {
    // return false;
    // }
    // if (arr.length == 1) {
    // return true;
    // }
    // for (int i = 1; i < arr.length; i++) {
    // arr[i] += arr[i - 1];
    // }
    // if (arr[arr.length - 1] - arr[0] == 0 || arr[arr.length - 2] == 0) {
    // return true;
    // }

    // for (int i = 1; i < arr.length - 1; i++) {
    // if (arr[i - 1] == arr[arr.length - 1] - arr[i]) {
    // return true;
    // }
    // }
    // return false;
    public boolean method(int arr[]){
        if (arr == null || arr.length == 0) {
            return false;
        }
        int leftsum=0;
        int totalsum=0;
        int rightsum=0;
        for(int nums : arr){
            totalsum+=nums;
        }
        for(int i = 0;i<arr.length;i++){
             rightsum = totalsum -leftsum -arr[i];
            if(leftsum==rightsum){
                return true;
            }
            leftsum+=arr[i];
        }
        return false;
    }
    }
