package Pointer.easy;
//下标对中的最大距离
public class L1885 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int max=0;
        while (i<nums1.length&&j<nums2.length){
            while (j<nums2.length&&nums1[i]<=nums2[j]){
                j++;
            }
            max=Math.max(max,j-i-1);
            i++;
        }
        return max;
    }
}
