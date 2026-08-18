// public class minimum_consecutive_flips {
//     public int conflip(int arr[]){
//         int group_0=0;
//         int group_1=0;
//         if(arr[0]==0){
//             group_0++;
//         }
//         else{
//             group_1++;
//         }
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]!=arr[i-1]){
//                 if(arr[i]==1)
//                     group_1++;
//                 else{
//                     group_0++;
//                 }
//             }
//         }            
//         return Math.min(group_0, group_1);
//     }
    
// }
public class minimum_consecutive_flips {
    public int conflip(int arr[]){
        int flip=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                flip++;
            }
        }
        return (flip+1)/2;
    }
}
