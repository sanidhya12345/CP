package leetcode;

public class lc4242 {

	public static boolean isZeroArray(int[] nums, int[][] queries) {
	    int n = nums.length;
	    int[] diff = new int[n + 1]; 
	    for (int[] query : queries) {
	        int start = query[0];
	        int end = query[1];
	        // Mark the range for decrement
	        diff[start] += 1; // Start decrement at `start`
	        if (end + 1 < diff.length) {
	            diff[end + 1] -= 1; // Stop decrement after `end`
	        }
	    }
	    int currDecrement = 0;
	    for (int i = 0; i < n; i++) {
	        currDecrement += diff[i]; 
	        if (nums[i]>currDecrement) {
	            return false; 
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2};
		int [][] queries= {{0,0},{0,0},{0,0}};
		System.out.println(isZeroArray(num, queries));
	}

}
