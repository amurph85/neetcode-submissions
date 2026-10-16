class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, result, curr, new boolean[nums.length]);
        return result;
    }
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> curr, boolean[] used){
        if(curr.size() > nums.length){
            return;
        }

        if(curr.size() == nums.length){
            result.add(new ArrayList(curr));
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i] = true;

            backtrack(nums, result, curr, used);
            curr.remove(curr.size() - 1);

            used[i] = false;
        }
            
    }
}
