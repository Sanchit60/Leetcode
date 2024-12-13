class Solution {
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
        
    }

    public boolean sudokuSolver(char [][] board, int row, int col){

        if(row == board.length){
            return true;
        }
        if(col == board[0].length){
            boolean res = sudokuSolver(board, row + 1, 0);
            return res;
            
        }
        
        if(board[row][col] == '.'){
            for(char i = '1'; i <= '9'; i++){
                if(isValid(board, row, col, i) == true){
                    board[row][col] = i;
                    boolean res = sudokuSolver(board, row, col + 1);
                    if(res == true){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        } else {
            boolean res = sudokuSolver(board, row, col + 1);
            return res;
        }

        return false;
        
    }

    public boolean isValid(char [][] board, int row, int col, char val){
        for(int j = 0; j < board[0].length; j++){
            if(board[row][j] == val){
                return false;
            }
        }
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == val){
                return false;
            }
        }
        int stRow = (row/3)*3;
        int stCol = (col/3)*3;

        for(int i = stRow; i < stRow + 3; i++){
            for(int j = stCol; j < stCol + 3; j++){
                if(board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
}
