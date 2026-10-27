package Windows.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
/*ages[y] <= 0.5 * ages[x] + 7
ages[y] > ages[x]
ages[y] > 100 && ages[x] < 100*/
//适龄的朋友
public class L825 {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int left=ages.length-1;
        int right=ages.length-1;
        int ans=0;
        for(left=ages.length-1;left>=0;left--){
         while ((ages[left] <= 0.5 * ages[right] + 7)||(ages[left] > ages[right])||(ages[left] > 100 && ages[right] < 100)){

         }

        }
        return ans;
    }
}
