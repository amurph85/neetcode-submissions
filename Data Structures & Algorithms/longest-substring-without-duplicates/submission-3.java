class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int result = 0;
        int count = 0;
        char[] charas = s.toCharArray();
        for (int i = 0; i < charas.length; i++){
            Character chara = charas[i];
            if(seen.contains(chara)){
                result = Math.max(result, count);
                i -= count; 

                count = 0;
                seen.clear();
            }
            else{
                count++;
                seen.add(chara);
            }
        }
        return Math.max(result,count);
        
    }
}
