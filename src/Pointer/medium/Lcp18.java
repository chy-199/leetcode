package Pointer.medium;

import java.lang.annotation.Target;
import java.util.Arrays;

//早餐组合
public class Lcp18 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i=0;
        int j=drinks.length-1;
        long ans=0;
        while (i<staple.length&&j>=0){
            if(staple[i]+drinks[j]>x){
                j--;
            }
            else {
                ans+=j+1;
            }
        }
        return (int)(ans%1000000007);
    }
}
