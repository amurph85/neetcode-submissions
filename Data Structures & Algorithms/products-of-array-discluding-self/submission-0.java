class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int total = 1;
        int zeroTally = 0;
        for(int num: nums){
            if(num == 0){
                zeroTally++;
            }
            else{
                total = total*num;
                }
        }
        if (zeroTally > 1){
            return result;
        }
        for (int i = 0; i < nums.length; i++){
            
            if (zeroTally>0){
                if(nums[i] == 0){
                    result[i] = total;
                }
                else{
                    result[i] = 0;
                }
            }
            else{
                result[i] = (total/(nums[i]));};
        }
        return result;
    }
}  
