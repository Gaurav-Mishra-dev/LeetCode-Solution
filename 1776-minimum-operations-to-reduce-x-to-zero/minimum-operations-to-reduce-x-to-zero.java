class Solution {
    public int minOperations(int[] nums, int x) {
        int i=0;
        int total = 0;
        while(i<nums.length){
            total+=nums[i];
            i++;
        }
        int target = total -x;
        if(target == 0)
        return nums.length;
        int l = 0;
        int r = 0;
        int sum =0;
        int max = -1;

        while(r<nums.length){
            sum+=nums[r];

            while(l<=r && sum>target){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
                max = Math.max(max , r-l+1);
            }
            r++;
        }
        if(max == -1){
            return -1;
        }
        return nums.length-max;
    }
}