package Pointer.easy;
//给植物浇水
public class L2105 {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count=0;
        int left=0;
        int right=plants.length-1;
        int totalA=0;
        int totalB=0;
        while (left<right){
            totalA=totalA+plants[left];
            totalB=totalB+plants[right];
            if(totalA>capacityA){
                totalA=plants[left];
                count++;
            }
            if(totalB>capacityB){
                totalB=plants[right];
                count++;
            }
            left++;
            right--;
        }
        if(left==right){
            int max=Math.max(capacityA-totalA,capacityB-totalB);
            if(max<plants[left])count++;
        }
        return count;
    }
}
