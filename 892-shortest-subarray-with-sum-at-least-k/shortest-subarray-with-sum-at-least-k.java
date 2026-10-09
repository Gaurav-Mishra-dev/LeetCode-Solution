class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long prefix[] = new long[nums.length+1];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for(int r=0;r<=nums.length;r++){
            while(!dq.isEmpty() &&  prefix[r]-prefix[dq.peekFirst()]>=k ){
                min = Math.min(min,r-dq.pollFirst());
            }
            while(!dq.isEmpty() && prefix[r]<=prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(r);
        }
        if(min==Integer.MAX_VALUE)
        return -1;

        return min;
    }
}