public class freqinsorted {
    public static void frequency_sorted_array(int arr[]){
        int count=1;
        if (arr.length == 0)
             return;
        int key=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]!=arr[i]){
                System.out.println(key+" "+count);
                count=1;
                key=arr[i+1];
            }
            else{
                count++;
            }
        }
                System.out.println(key+" "+count);

    }
    
}
