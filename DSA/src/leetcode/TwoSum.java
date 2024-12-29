package leetcode;

public class TwoSum {

	public static boolean twoSum(int [] arr,int target) {
		int n=arr.length;
		for(int i=0,j=1;j<n;j++) {
			int sum=arr[i]+arr[j];
			if(sum>target) {
				i++;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,7,11,15};
		System.out.println(twoSum(arr, 9));
	}

}
