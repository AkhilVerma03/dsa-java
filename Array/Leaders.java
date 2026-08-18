public class Leaders{
    public static void leaders(int arr[]){
        int largest=arr[arr.length-1];
        System.out.println(largest);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>largest){
                largest=arr[i];
                System.out.println(arr[i]);
            }


        }
    }
}