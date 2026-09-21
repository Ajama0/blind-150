class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        /**
        if each car represents the position relativie to the distance,
        then we can decide based on the arrival time whether it joins
        a fleet, 

        example position 4 is closer to target than 1 but if we 
        calculate the arrival time of both they are equal meaning
        at some point they intersect as car 1 would just be at
        the same speed at car pos 4. a car cannot go ahead of another
        car so they are within same speed

        time = distance/speed. 

        if we map each position and its speed and sort by position 
        then we can place the first arrival time onto the stack

        if any other car has a higher time than stack.peek() then it
        means that they arrived after the first fleet. so that car 
        is added to the fleet

        if a car arrives at the same time or less than the current fleet
        then it is part of that fleet

        for example
        10-1/3 = 3
        10-4/2 = 3 therefore car at pos 4 and car pos 1 arrive same time
        so they are part of of a single fleet. 

        when car 4 was in stack and car 1 came it can only join that fleet
        because it will arrive at the same time

        */


        Map<Integer,Integer> positions = new HashMap<>();
        Stack<Double> fleets = new Stack<>();

        //lets map each position to its speed
        for(int i=0; i<position.length;i++){
            positions.put(position[i],speed[i]);
        }

        //lets sort them in descending order, so we know which car
        //is closest to the target

        List<Map.Entry<Integer,Integer>>sortedPositions = 
        new ArrayList<>(positions.entrySet());

        sortedPositions.
        sort((a,b) -> Integer.compare(b.getKey(),a.getKey()));

        
        
        for(int i=0; i<sortedPositions.size(); i++){
            //for each position we need to calculate the arrival time
            //if the stack isnt empty and the current


            int spd = sortedPositions.get(i).getValue();  
            int distance = target - sortedPositions.get(i).getKey();
            double time = (double) distance/spd;
            if(fleets.isEmpty() || time > fleets.peek()){
                //we want to push this onto the stack as new fleet
                //becomes new peek
                fleets.push(time);
            }
        }
        return fleets.size();

        
        
    }
}
