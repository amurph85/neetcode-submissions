class Solution {
    public int maxProfit(int[] prices) {
        int low = 1000000000;
        int result = 0;
        int high = 0;
        for (int price: prices){
            low = Math.min(low, price);
            result = Math.max(result, price - low);
        }
        return result;
    }
}
