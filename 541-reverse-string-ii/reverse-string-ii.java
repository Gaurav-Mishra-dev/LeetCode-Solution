class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        // to move k than 2k
        for(int i=0;i<s.length();i+=2*k){
            int left = i; // start reversing 
            int right = i+k-1; // where should i stop

            // prevent indexing 
            if(right>=ch.length){
                right = ch.length-1;
            }
            // start swaping 
            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        // written as String 
        return new String(ch);
    }
}