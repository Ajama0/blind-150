class Solution {
    public boolean isValidSudoku(char[][] board) {

        /*
        we can do this in three sequential passes
        first lets loop through each row and check for each row
        if it contains a duplicate

         then for each column we can check to see duplicates
        if the value is "." we can skip that iteration

        for ensuring a valid 3x3 grid we can split the grid into
            0 1 2
        0
        1
        2
        essentially each index will fall into one of these grids
        lets say we have [1][1] if we divide them both by 3
        r/3 and c/3 with integer division it is 0,0 so they fall into
        this grid.

        we can have a hashset that holds all of the values that fall into
        that range
        */

        //rows
        for(int i = 0; i<board[0].length;i++){
            Set<Character> rows = new HashSet<>();
            for(int j=0; j<board[0].length;j++){
                if(board[i][j] == '.'){
                    continue;
                } 
                if(!rows.add(board[i][j])){
                    return false;
                }
            }
        }

         //column
        for(int c = 0; c < board[0].length;c++){
            Set<Character> cols = new HashSet<>();
            for(int r = 0; r<board[0].length; r++){
                if(board[r][c] == '.'){
                    continue;
                }
                if(!cols.add(board[r][c])){
                    return false;
                }
            }
        }


        //3x3 grid
        //get the grid for each index r/3 c/3 and then add it
        Map<List<Integer>, Set<Character>> grid = new HashMap<>();

        for(int r = 0; r<board[0].length; r++){
            for(int c = 0; c<board[0].length; c++){
                if(board[r][c] == '.'){
                    continue;
                }
                
                //if adding the value to the grid returns false
                //means there is a duplicate
                boolean b = grid.computeIfAbsent(List.of(r/3, c/3), 
                k-> new HashSet<>()).add(board[r][c]);
                
                if(!b){
                    return false;
                }
            }
        }

        return true;


        
        
    }
}
