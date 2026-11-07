package Pointer.easy;
//复写0
public class L1089 {
    public void duplicateZeros(int[] arr) {
        int j = 0;
        int i = 0;
        for (i = 0; j < arr.length; i++) {
            if (arr[i] == 0) {
                j++;
            }
            j++;
        }
        int slow = arr.length - 1;
        int fast = i - 1;
        if (j > arr.length) { // 最后一个 0 只放得下一半，先落一个，然后跳过它
            arr[slow] = 0;
            slow--;
            fast--;
        }

        for (fast = fast; fast >= 0; fast--) {
            if (slow >= 0 && arr[fast] == 0) {
                arr[slow] = 0;
                slow--;
            }
            if (slow >= 0) {
                arr[slow] = arr[fast];
                slow--;
            }
        }
    }
}
