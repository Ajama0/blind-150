class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Stack<Double> fleet = new Stack<>();
        Map<Integer,Integer> cars = new HashMap<>();

        for(int i = 0; i<position.length; i++){
            cars.put(position[i], speed[i]);
        }

        //sort it 

        List<Map.Entry<Integer,Integer>> sortedCars = new ArrayList<>(cars.entrySet());

        //sorting in descending order
        sortedCars.sort((a,b) -> b.getKey() - a.getKey());


        for(int i =0; i<sortedCars.size(); i++){
            //for each car compute its time
            //then if its greater than the stack.peek() 
            // it becomes a new car fleet
            
            double time 
            =(double)(target-sortedCars.get(i).getKey())
            /sortedCars.get(i).getValue();

            if(fleet.isEmpty()){
                fleet.push(time);
            }

            if(time > fleet.peek()){
                fleet.push(time);      
            }
        }

        return fleet.size();
        
    }
}
