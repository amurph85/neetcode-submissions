public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();

            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                map.put(key, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(map.values());
    }
}