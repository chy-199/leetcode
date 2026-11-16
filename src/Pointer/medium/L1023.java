package Pointer.medium;

import java.util.ArrayList;
import java.util.List;

//驼峰式匹配
public class L1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans=new ArrayList<>();
        int n=0;
        for(n=0;n<queries.length;n++){
            int i=0;
            int j=0;
            String temp=queries[n];
            boolean result=false;
            while (i<temp.length()){
                if((temp.charAt(i)>='A')&&(temp.charAt(i)<='Z')&&(pattern.charAt(j)>='A')&&(pattern.charAt(j)<='Z')){
                   if(temp.charAt(i)!=pattern.charAt(j)) {
                       result = false;
                       break;
                   }
                }
                if(temp.charAt(i)==pattern.charAt(j)){
                    i++;
                    j++;
                }
                else {
                    i++;
                }
                if(j==pattern.length()){
                    result=true;
                    break;
                }
            }
            while (i<temp.length()){
                if((temp.charAt(i)>='A')&&(temp.charAt(i)<='Z')){
                    result=false;
                    break;
                }
                i++;
            }
            ans.add(result);
        }
        return ans;
    }
}
