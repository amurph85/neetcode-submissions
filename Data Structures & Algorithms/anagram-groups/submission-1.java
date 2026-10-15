public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] character = str.toCharArray();
            Arrays.sort(character);
            String key = new String(character);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>(List.of(str)));
            }else{
                map.get(key).add(str);
            }
        } 
        return new ArrayList<>(map.values()) ;      
    }
}


