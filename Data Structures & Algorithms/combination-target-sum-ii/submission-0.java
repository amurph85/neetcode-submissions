class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(0, candidates, target, result, curr);
        return result;

    }

    private void backtrack(int index, int[] nums, int target, List<List<Integer>> result, List<Integer> curr){
        Arrays.sort(nums);
        int sum = curr.stream().mapToInt(Integer::intValue).sum();
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        if(index >= nums.length || sum > target){
            return;
        }

        curr.add(nums[index]);
        backtrack(index + 1, nums, target, result, curr);
        curr.remove(curr.size() - 1);

        while(index < nums.length - 1 && nums[index] == nums[index + 1]){
            index++;
        }

        backtrack(index + 1, nums, target, result, curr);


    }
}
