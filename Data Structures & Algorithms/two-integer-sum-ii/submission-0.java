class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        the brute force solution is o(n^2) which means for each value
        we check every other possible value to see if it adds up to target

        optimal solution is to use two pointers with a lp at 1
        and the rp num.length as it is one indexed.


        */
        
    

    int lp = 0;
    int rp = numbers.length-1;

    while(lp<rp){
        if(numbers[lp]+numbers[rp]>target){
            rp--;
        }else if(numbers[lp] + numbers[rp]<target){
            lp++;
        }else{
            //return the index of lp and rp
            return new int[]{lp+1,rp+1};
        }

    }
    return new int[]{};
    }
}
