class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0] =0;

        for(int i=0;i<n;i++){
            for(int j=1;j<=nums[i] && i+j<n;j++){
                arr[i+j] = Math.min(arr[i+j] , arr[i]+1);
            }
        }
        return arr[n-1];
    }
}