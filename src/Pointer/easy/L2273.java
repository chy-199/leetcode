package Pointer.easy;

import java.util.ArrayList;
import java.util.List;

//移除字母异位词之后的结果数组
public class L2273 {
    public List<String> removeAnagrams(String[] words) {
        String word;
        List<String> ans=new ArrayList<>();
        int fast=0;
        for(fast=0;fast< words.length;fast++){
            word=words[fast];
            while (fast+1< words.length&&isAnagram(words[fast],words[fast+1])){
                fast++;
            }
            ans.add(word);
        }
        return ans;
    }
    public boolean isAnagram(String word1,String word2){
        if(word1.length()!=word2.length())return false;
        int[] flag=new int[26];
        for(int i=0;i<word1.length();i++){
            int c1=word1.charAt(i)-'a';
            int c2=word2.charAt(i)-'a';
            flag[c1]++;
            flag[c2]--;
        }
        for(int i=0;i<word1.length();i++){
            int c=word1.charAt(i)-'a';
            if(flag[c]!=0)return false;
        }
        return true;
    }
}
