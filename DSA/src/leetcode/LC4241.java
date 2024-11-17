package leetcode;

import java.util.Scanner;

public class LC4241 {
	
	public static int countValidSelections(int[] nums) {
	     int n=nums.length;
	     int count=0;
	     for(int i=0;i<n;i++) {
	    	 if(nums[i]==0) {
	    		 if(checkValid(nums.clone(),i,true) || checkValid(nums.clone(),i,false)) {
	    			 count++;
	    		 }
	    	 }
	     }
	     return count;
	}
	
	private static boolean checkValid(int[] nums, int i, boolean right) {
		// TODO Auto-generated method stub
		int curr=i;
		while(curr>=0 && curr<nums.length) {
			if(nums[curr]==0) {
				curr+=right?1:-1;
			}
			else {
				nums[curr]--;
				right=!right; //reverse the direction
				curr+=right?1:-1;
			}
			
			for(int num:nums) {
				if(num!=0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(countValidSelections(arr));
		sc.close();
	}
}
