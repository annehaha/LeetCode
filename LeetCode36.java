import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

	The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
	
	A partially filled sudoku which is valid.
 *  */

public class LeetCode36 {

	public boolean isValidSudoku(char[][] board) {
		if(board.length==0)return false;
        HashSet set=new HashSet();  //use hashset to judge the only existence
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j]=='.')
        			continue;
        		if(set.contains(board[i][j])){
        			return false;
        		}
        		set.add(board[i][j]);
        	}
        	set.clear();
        }
        
        for(int j=0;j<9;j++){
        	for(int i=0;i<9;i++){
        		if(board[i][j]=='.')
        			continue;
        		if(set.contains(board[i][j])){
        			return false;
        		}
        		set.add(board[i][j]);
        	}
        	set.clear();
        }
        
        for(int k=0;k<3;k++){
            for(int q=0;q<3;q++){
            	for (int i = k*3; i < k*3+3; i++) {
            		for (int j =q*3; j < q*3+3; j++) {
		       			if(board[i][j]=='.')
		           			continue;
		           		if(set.contains(board[i][j])){
		           			return false;
		           		}
		           		set.add(board[i][j]);
		           	}
            	}
            	set.clear();  //notice then to set clear
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode36 t = new LeetCode36();
		char num[][]={};
		System.out.println(t.isValidSudoku(num));
		
	
	}
}
