package leetcode;

import java.util.Scanner;

public class MinimumSizeSubarraySum {

	public static int minSubArrayLen(int target, int[] nums) {
	    int n = nums.length;
	    int i = 0;
	    int sum = 0;
	    int minLength = Integer.MAX_VALUE;

	    for (int j = 0; j < n; j++) {
	        sum += nums[j];
	        
	        // While the sum is greater than or equal to the target, try to shrink the window
	        while (sum >= target) {
	            minLength = Math.min(minLength, j - i + 1);
	            sum -= nums[i];
	            i++;
	        }
	    }
	    // If no valid subarray is found, return 0
	    return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int [] arr=new int[n];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println(minSubArrayLen(target, arr));
	}

}
