package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//leetcode contest 423 first problem solution
public class AdjacentIncreasingSubarray {

    
	 public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
	        int n = nums.size();
	        
	        // Edge case: If the array size is less than 2*k, no two adjacent subarrays can exist
	        if (n < 2 * k) {
	            return false;
	        }
	        // Iterate through the array
	        for (int i = 0; i <= n - 2 * k; i++) {
	            // Check if the first subarray nums[i..i+k-1] is strictly increasing
	            boolean isFirstIncreasing = true;
	            for (int j = i; j < i + k - 1; j++) {
	                if (nums.get(j) >= nums.get(j + 1)) {
	                    isFirstIncreasing = false;
	                    break;
	                }
	            }
	            
	            // Check if the second subarray nums[i+k..i+2k-1] is strictly increasing
	            boolean isSecondIncreasing = true;
	            for (int j = i + k; j < i + 2 * k - 1; j++) {
	                if (nums.get(j) >= nums.get(j + 1)) {
	                    isSecondIncreasing = false;
	                    break;
	                }
	            }

	            // If both subarrays are strictly increasing, return true
	            if (isFirstIncreasing && isSecondIncreasing) {
	                return true;
	            }
	        }

	        // If no such pair of subarrays exists, return false
	        return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer>list=new ArrayList<Integer>();
		int i=0;
		while(i<n) {
			list.add(sc.nextInt());
			++i;
		}
		System.out.println(hasIncreasingSubarrays(list, k));
		sc.close();
		
	}

}
