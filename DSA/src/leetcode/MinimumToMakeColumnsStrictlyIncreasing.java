package leetcode;

public class MinimumToMakeColumnsStrictlyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] grid = {{3,2},{1,3},{3,4},{0,1}};
		int ops=0;
		
		int n=grid.length;
		int m=grid[0].length;
		for(int col=0;col<m;col++) {
			for(int row=1;row<n;row++) {
				if(grid[row-1][col]>=grid[row][col]) {
					ops+=Math.abs(grid[row-1][col]-grid[row][col])+1;
					grid[row][col]+=Math.abs(grid[row-1][col]-grid[row][col])+1;
				}
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(ops);
	}

}
