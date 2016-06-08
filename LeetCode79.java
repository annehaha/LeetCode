import java.util.*;

/*
 * Given a 2D board and a word, find if the word exists in the grid.

	The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
	
	For example,
	Given board =
	
	[
	  ['A','B','C','E'],
	  ['S','F','C','S'],
	  ['A','D','E','E']
	]
	word = "ABCCED", -> returns true,
	word = "SEE", -> returns true,
	word = "ABCB", -> returns false.
*/

public class LeetCode79 {
	public boolean exist(char[][] board, String word) {
		if (word.length() == 0 || board.length == 0)
			return false;
		char[] w = word.toCharArray();
		boolean visited[][] = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == w[0]){
					if (find(board, visited,w, 0, i, j))
						return true;
				}
			}
		}
		return false;
	}

	public boolean find(char[][] board, boolean visited[][], char[] word ,int index, int i, int j){

		if(board[i][j]==word[index]){
			visited[i][j]=true;	
			if(index==word.length-1)return true;
			if(i-1>=0&&!visited[i-1][j]){
				if(find(board,visited,word,index+1,i-1,j))return true;  //index+1 doesn't change index value!
			}
			if(i+1<board.length&&!visited[i+1][j]){
				if(find(board,visited,word,index+1,i+1,j))return true;
			}
			if(j-1>=0&&!visited[i][j-1]){
				if(find(board,visited,word,index+1,i,j-1))return true;
			}
			
			if(j+1<board[0].length&&!visited[i][j+1]){
				if(find(board,visited,word,index+1,i,j+1))return true;
			}
			
		}
		visited[i][j]=false;
		return false;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode79 t = new LeetCode79();
		char[][] nums = { { 'A', 'B','C', 'E'} ,{ 'S', 'F', 'C','S'} ,{ 'A', 'D', 'E','E'} };
		System.out.println(t.exist(nums, "ABCB"));
	}

}
