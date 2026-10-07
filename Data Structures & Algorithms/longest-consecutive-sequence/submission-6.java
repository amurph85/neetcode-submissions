class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;
        int highCount = 0;
        for(int i = 0; i < nums.length; i++){
            seen.add(nums[i]);
        }
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] + 1) {
                continue;
            }
            int num = nums[i];
            count = 1;
            while(seen.contains(num + 1)){
                count++;
                num++;
            }
            if(count > highCount){
                highCount = count;
            }
        }

        return highCount;
    }
}
