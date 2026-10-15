class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0, nums, target, result, curr);
        return result;

    }
    private void backtrack(int index, int[] nums, int target, List<List<Integer>> result, List<Integer> curr){
        int sum = curr.stream().mapToInt(Integer::intValue).sum();
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        if(index >= nums.length || sum > target){
            return;
        }

        curr.add(nums[index]);
        backtrack(index, nums, target, result, curr);
        curr.remove(curr.size() - 1);
        backtrack(index + 1, nums, target, result, curr);


    }
}
