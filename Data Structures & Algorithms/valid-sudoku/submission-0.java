class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!set.contains(board[i][j])) set.add(board[i][j]);
                else return false;
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(!set.contains(board[j][i])) set.add(board[j][i]);
                else return false;
            }
        }
        for(int i=0;i<=6;i=i+3){
            for(int j=0;j<=6;j=j+3){
                HashSet<Character> lset = new HashSet<>();
                for(int x=i;x<=i+2;x++){
                    for(int y=j;y<=j+2;y++){
                        if(board[x][y]=='.') continue;
                        if(!lset.contains(board[x][y])) lset.add(board[x][y]);
                        else return false;
                    }
                }
            }
        }
        return true;
    }
}
