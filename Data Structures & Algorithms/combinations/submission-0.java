class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtracking(1, n, k, curr, result);
        return result;


    }
    private void backtracking(int num, int n, int k, List<Integer> curr, List<List<Integer>> result){
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }

        if (num > n) {
            return;
        }
        curr.add(num);
        backtracking(num + 1, n, k, curr, result);
        curr.remove(curr.size() - 1);
        backtracking(num + 1, n, k, curr, result);


    }
}


