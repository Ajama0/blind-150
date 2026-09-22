class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        /*

        koko wants to eat a lower speed where he can finish
        all the bananas in time

        [1,4,3,2] an integer array, each piles[i] represents number
        of bananas

        h tells us how many hours we have to eat all bananas.
        if we eat it at a rate of 1 hour per pile thats 10 hours
        which exceeds 9 hours.

        we need to find the minimum k which is the bananas eaten per hour
        that we can eat in the h given

        now the bananas per hour can never exceed k 
        so our search space is from k = 1 ... 11


        if(value<=h then we can search for a better minimum)
        best = k
        and set the Math.min(best,current)


        were looking for the minimum speed koko can eat at to finish
        in time.

        */
        int rp = 0;
        for(int i =0; i<piles.length;i++){
            rp = Math.max(rp,piles[i]);
        }

        int lp = 1;
        int bestMin = rp;
        while(lp<=rp){
            //compute the middle 
            int mid = lp + (rp-lp) /2;
            long hoursAtK = 0;

            //for each middle value we need to check if this rate
            //of eating is greater or smaller than h
            //if smaller we can keep going down and get result
            for(int i=0; i<piles.length;i++){
                hoursAtK += (piles[i] + mid - 1) / mid;
            }
            if(hoursAtK<=h){
                //record the best minimum
                bestMin = mid;
                //lets search for a lower rate
                rp = mid - 1;    
            }else{
                lp = mid + 1;
            }
        }

        return bestMin;

        
    }
}
