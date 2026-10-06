class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            seen.put(c, seen.getOrDefault(c, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            if(!seen.containsKey(c)){
                return false;
            }
            int remaining = seen.get(c) - 1;
            if (remaining == 0){
                seen.remove(c);
            }
            else{
                seen.put(c, remaining);
            }
        }
        return seen.isEmpty();
        
    }
}
