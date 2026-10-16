class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> result = new ArrayList<>();
        String curr = new String();
        if (digits.isEmpty()) return result;
        backtrack(0, map, digits, curr, result);
        
        return result;
    }
    private void backtrack(int index, HashMap<Integer, String> map, String digits, String curr, List<String> result){
        if(curr.length() == digits.length()){
            result.add(curr);
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = map.get(digit);
        for(int i = 0; i < letters.length(); i ++){
            backtrack(index + 1, map, digits, curr + letters.charAt(i), result);

        }
    }
}
