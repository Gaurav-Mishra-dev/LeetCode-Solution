
class Solution {
    public int longestSubsequence(String s, int k) {
        int maxlen = 0;
        long deci = 0;
        long idx = 1;

        for(int i=s.length()-1;i>=0;i--){
            int bit=s.charAt(i)-'0';

            if(bit==0){
                maxlen++;
            }else{
                if(idx>k || deci+idx>k){
                    if(idx<=k){
                        idx*=2;
                    }
                    continue;
                }
                deci+=idx;
                maxlen++;
            }
            if(idx<=k) {
                idx *=2;
            }
        }
        return maxlen;
    }
}
