class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, hi = 0;

        for(int pile: piles){
            hi = Math.max(hi, pile);
        }

        while(low < hi){
            int middle = low + (hi - low) / 2;
            long hours = 0;
            for(int pile: piles){
                hours += (pile + middle - 1)/ middle;
            }
            if(hours <= h){
                hi = middle;
            
            }else{
                low = middle + 1;
            }
        }
        return low;
    }
}
