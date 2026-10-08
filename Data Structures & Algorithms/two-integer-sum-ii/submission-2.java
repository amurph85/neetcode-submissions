class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length-1;
        while(pointer1 < pointer2){
            int currentSum = numbers[pointer1] + numbers[pointer2];
            if (currentSum > target){
                pointer2--;
            } else if (currentSum < target){
                pointer1++;
            } else{
                return new int[] {pointer1 + 1, pointer2 + 1};
            }

        }
        return new int[0];

    }
}
