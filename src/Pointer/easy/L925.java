package Pointer.easy;
//长按键入
public class L925 {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        boolean ok=true;
        for(i=0;i<name.length();){
            if(j>=typed.length()|| name.charAt(i)!=typed.charAt(j)){
                ok=false;
                break;
            }
            while(i<name.length()&&j<typed.length()&&name.charAt(i)==typed.charAt(j)){
                j++;
                i++;
            }
            while (i>0&&j<typed.length()&& name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
        }
        return ok&&j==typed.length();
    }
}
