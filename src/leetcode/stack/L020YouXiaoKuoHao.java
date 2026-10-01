package leetcode.stack;

public class L020YouXiaoKuoHao {
    public boolean isValid(String s) {
        int l=s.length();
        char stack[]=new char[l];
        int top=-1;
        int i=0;
        while(i<l){
          if(top<0){
              char temp=s.charAt(i);
              if(temp=='['||temp=='('||temp=='{') {
                  stack[++top] = temp;
                  i++;
              }
              else return false;
          }
          else {
              char temp=s.charAt(i);
              if(temp=='['||temp=='('||temp=='{')stack[++top]=temp;
              else {
                switch (stack[top]){
                  case '(': if(temp==')'){
                      top--;
                      break;
                      }
                      else return false;
                  case '[':if(temp==']'){
                      top--;
                      break;
                  }
                  else return false;
                  case '{':if(temp=='}'){
                      top--;
                      break;
                  }
                  else return false;
                }
              }
              i++;
          }
        }
        if(top>0)return false;
        else return true;
    }
}
