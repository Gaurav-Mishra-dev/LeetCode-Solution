class Solution {
    public boolean solve(int[] arr , int start, boolean[] jump){
        if(start<0 || start >=arr.length ||  jump[start])
        return false;

        if(arr[start] ==0)
        return true;

        jump[start] = true;
       boolean a= solve(arr,start-arr[start],jump);
      boolean b=  solve(arr, start+arr[start] , jump);

    return a || b;
}

    public boolean canReach(int[] arr, int start) {
        boolean[] jump = new boolean[arr.length];
        return solve(arr,start , jump);
    }
    }
