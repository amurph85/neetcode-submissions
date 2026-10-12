class Solution {
    public int characterReplacement(String s, int k) {
        char[] letters = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        for (int i = 0; i < letters.length; i++){
            map.put(letters[i], map.getOrDefault(letters[i], 0) + 1);
            int highestCount = Collections.max(map.values());
             while ((i - left + 1) - highestCount > k) {
                map.put(letters[left], map.get(letters[left]) - 1);
                left++;

                highestCount = Collections.max(map.values());
            }
            result = Math.max(result, i - left + 1);
        }
        return result;

    }
}
