class Solution {
    public int maxProfit(int[] prices) {

        /**
        [10,1,5,6,7,1]

        if i buy on one day i can only sell it on the day after
        so if i buy on 10 and i sell when its one
        im in -9 profit. 
        so should we move the rp down until lp<rp on a day where
        

        profit = selling - buying day

        move the pointer based on t

        positive means lp is lower than rp, meaning better day to buy
        if negative means the buying price is too high so move it.

        */

        int lp = 0;
        int rp = lp + 1;
        int maxProfit = 0;
        int currentProfit = 0;

        while(lp<rp && rp<=prices.length-1){
            currentProfit = prices[rp] - prices[lp];
            maxProfit = Math.max(maxProfit, currentProfit);
            //if negative we want to move lp as buying price too high
            //we still need to move rp though on all conditions
            //if price is positive that means lp 
            if(currentProfit<0){
                lp = rp;
            }
                //if the sum is positive that means we bought it 
                //at  the current lowest so lets look at days to buy
                rp++;

            }    

        
        return maxProfit;







        
    }
}
