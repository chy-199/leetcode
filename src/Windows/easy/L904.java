package Windows.easy;
//水果成篮
public class L904 {
    public int totalFruit(int[] fruits) {
           int match=0;
           int left=0;
           int right=0;
           int max=0;
           int[] category=new int[fruits.length];
           for(right=0;right<fruits.length;right++){
                category[fruits[right]]++;
                if(category[fruits[right]]==1)match++;
                while (match>2){
                    if(category[fruits[left]]==1)match--;
                    category[fruits[left]]--;
                    left++;
                }
                max=Math.max(max,right-left+1);
           }
           return max;
    }
}
