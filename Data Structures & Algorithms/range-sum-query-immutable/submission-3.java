class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            prefix[i] = curr;
        }
    }
    
    public int sumRange(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = 0;
        if(left > 0){
            leftSum = prefix[left - 1];
        }else{
            leftSum = 0;
        }
        return rightSum - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */