class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        return 0;
        int count = 0;
        int l=0;

        while(l<nums.length){
            int r=l;
            long product =1;

            while(r<nums.length){
                product*=nums[r];

                if(product<k){
                    count++;
                }else{
                    break;
                }
                r++;
            }
            l++;
        }
        return count;
    }
}