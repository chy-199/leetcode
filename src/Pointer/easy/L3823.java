package Pointer.easy;
//反转一个字符串里的字母后反转特殊字符
public class L3823 {
    public String reverseByType(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if ((arr[left] <= 'z' && arr[left] >= 'a') && (arr[right] <= 'z' && arr[right] >= 'a')) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if ((arr[left] <= 'z' && arr[left] >= 'a') && (arr[right] > 'z' || arr[right] < 'a')) {
                right--;
            } else if ((arr[right] <= 'z' && arr[right] >= 'a') && (arr[left] > 'z' || arr[left] < 'a')) {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        left = 0;
        right = arr.length - 1;
        while (left < right) {
            if ((arr[left] <= '^' && arr[left] >= '!') && (arr[right] <= '^' && arr[right] >= '!')) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if ((arr[left] <= '^' && arr[left] >= '!') && (arr[right] > '^' || arr[right] < '!')) {
                right--;
            }
            else if ((arr[right] <= '^' && arr[right] >= '!') && (arr[left] > '^' || arr[left] < '!')) {
                left++;
            }else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}