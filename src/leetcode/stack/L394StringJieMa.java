package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class L394StringJieMa {

    public String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();   // ① 存"重复次数"
        Deque<String> strStack = new ArrayDeque<>();   // ② 存"外层已拼好的半成品"
        StringBuilder sb = new StringBuilder();         // ③ 当前正在拼的字符串
        int num = 0;                                    // ④ 当前正在累积的次数

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                // 数字：只累积，不进栈（这样 12[a] 这种多位数才存得下）
                num = num * 10 + (c - '0');

            } else if (c == '[') {
                // 钻进去内层：先把"外层进度"存档，再清空，开始拼内层
                numStack.push(num);            // 存次数
                strStack.push(sb.toString());  // 存外层半成品 ← 这就是你之前缺的一步
                num = 0;
                sb.setLength(0);

            } else if (c == ']') {
                // 从内层出来：取回外层，把内层结果重复 k 次接上去
                int k = numStack.pop();        // 弹次数
                String prev = strStack.pop();  // 弹外层半成品
                String cur = sb.toString();    // 拍下内层结果
                sb.setLength(0);               // 清空
                sb.append(prev);               // 先接外层
                sb.append(cur.repeat(k));      // 内层重复 k 次（完整 k 次，不 -1）

            } else {
                // 字母：直接追加
                sb.append(c);
            }
        }

        return sb.toString();   // ← StringBuilder 要转成 String 才还得了
    }
}
