
import java.util.Arrays;

public class MaxGuest{
    public int maxGuest(int[] arrival , int[] departure){
        int n = arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i= 1 , j=0 , res= 1,curr=1;
        while(i<n && j<n){
            if(arrival[i]<departure[j]){
                i++;
                curr++;
            }
            else{
                curr--;
                j++;
            }
            res = Math.max(curr,res);
        }

        return res;
    }
}