public class infinteArraySearch {
    public int binarySearch(int low , int high , int target , int arr[]){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public int searchInfiniteArray(int arr[] , int target){
        if(arr[0]==target) return 0;
        int i =1;
        while(arr[i]<target){
            i*=2;
        }
        return binarySearch(i/2+1, i, target, arr);
    }
}
