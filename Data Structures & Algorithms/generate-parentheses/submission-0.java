class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String curr = new String();
        backtrack(n, 0, 0, curr, result);
        return result;
    }


    private void backtrack(int n, int open, int close, String curr, List<String> result){
        if(open == n && close == n){
            result.add(curr);
            return;
        }
        if (open < n) {
            backtrack(n, open + 1, close, curr + "(", result);
        }
        if(open > close){
            backtrack(n, open, close + 1, curr + ")", result);
        }

    }

}
