class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int[] nums = new int[num];
         if (sum > num * 9) {
            return "";
        }
        for(int i=0;i<num;i++){
            nums[i] = Math.min(9,sum);
            sum-=nums[i];
        }
        int max = 0;
        for(int i=0;i<num;i++){
            max+=nums[i]*nums[i];
        }
        StringBuilder ans = new StringBuilder();

        for(int i=0;i< num;i++) {
            ans.append(nums[i]);
        }

        return ans.toString();
    }
}