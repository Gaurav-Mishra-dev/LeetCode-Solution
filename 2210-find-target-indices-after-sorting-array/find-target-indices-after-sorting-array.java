class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        List<Integer> list = new ArrayList<>();
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid +1;
            }else{
                int right = mid + 1;
                int left = mid - 1;
                while(left >=0 && nums[left] == nums[mid]){
                    list.add(left);
                    left--;
                }
                list.add(mid);
                while(right <nums.length && nums[right] == nums[mid]){
                    list.add(right);
                    right++;
                }
                break;
            }
        }
        Collections.sort(list);
        return list;
    }
}