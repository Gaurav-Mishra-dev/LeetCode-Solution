class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum+=weights[i];
        }
        int low = max;
        int high = sum;

        while(low<high){
            int mid = (low+high)/2;
            int count = 0;
            int remain = 1;
            for(int j = 0;j<weights.length;j++){
                if(count+weights[j]>mid){
                    remain++;
                    count=0;
                }count+=weights[j];
            }
            if(remain<=days){
                high = mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}