/*
 *Follow up for "Unique Paths":

	Now consider if some obstacles are added to the grids. How many unique paths would there be?
	
	An obstacle and empty space is marked as 1 and 0 respectively in the grid.
	
	For example,
	There is one obstacle in the middle of a 3x3 grid as illustrated below.
	
	[
	  [0,0,0],
	  [0,1,0],
	  [0,0,0]
	]
	The total number of unique paths is 2.
 *  */

public class LeetCode63 {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int rec[][]= new int[m][n];
        if(obstacleGrid.length==0|| obstacleGrid[0].length == 0||obstacleGrid[0][0] == 1) return 0;  
        rec[0][0]=1;
        for(int i=1;i<m;i++){
        	if(obstacleGrid[i][0]==0&&rec[i-1][0]!=0)rec[i][0]=1;       	
        	else rec[i][0]=0; 
        }
        for(int i=1;i<n;i++){
        	if(obstacleGrid[0][i]==0&&rec[0][i-1]!=0)rec[0][i]=1;       	
        	else rec[0][i]=0; 
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		if(obstacleGrid[i][j]==1)rec[i][j]=0;
        		else{
        			rec[i][j]=rec[i-1][j]+rec[i][j-1];
        		}
        	}
        }
        return rec[m-1][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode63 t = new LeetCode63();
	    int num[][] = {{1,2,1},{3,4,1}};
		System.out.println(t.uniquePathsWithObstacles(num));
	}

}
