package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class L394StringJieMa {

    public String decodeString(String s) {
      Deque<Integer> numstack=new ArrayDeque<>();
      Deque<String>charstack=new ArrayDeque<>();
      StringBuilder str=new StringBuilder();
      int num=0;
      int i=0;
      for(i=0;i<s.length();i++){
          if(Character.isDigit(s.charAt(i))){
              num=num*10+(s.charAt(i)-'0');
          }
          else if(s.charAt(i)=='['){
              numstack.push(num);
              num=0;
              String cur=str.toString();
              str.setLength(0);
              charstack.push(cur);
          }
          else if(s.charAt(i)==']'){
              int temp=numstack.pop();
              String c=str.toString();
              str.setLength(0);
              String cur=c.repeat(temp);
              str.append(charstack.pop()+cur);
          }
          else {
              str.append(s.charAt(i));
          }
      }
      return str.toString();
    }
}
