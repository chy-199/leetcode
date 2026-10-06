package Windows.easy;
//考试的最大困扰度
//本质和删'0'留最大1的子串没区别
public class L2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int right=0;
        int match=0;
        int t=0;
        int f=0;
        for(right=0;right<answerKey.length();right++){
            char temp=answerKey.charAt(right);
            if(temp=='F')match++;
            while (match>k){
                temp=answerKey.charAt(left);
                if(temp=='F')match--;
                left++;
            }
            t=Math.max(t,right-left+1);
        }
        match=0;
        left=0;
        for(right=0;right<answerKey.length();right++){
            char temp=answerKey.charAt(right);
            if(temp=='T')match++;
            while (match>k){
                temp=answerKey.charAt(left);
                if(temp=='T')match--;
                left++;
            }
            f=Math.max(f,right-left+1);
        }
        return Math.max(t,f);
    }
}
