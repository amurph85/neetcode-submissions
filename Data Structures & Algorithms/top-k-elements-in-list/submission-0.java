class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        for (int j = 0; j < k; j++){
            Integer maxValue = Collections.max(
                map.entrySet(),Map.Entry.comparingByValue()
            ).getKey();
            result[j] = maxValue;
            map.remove(maxValue);
        }
        return result;
    }
        
}

