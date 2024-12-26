package slidingwindow;

import java.util.*;
public class FirstNegativeInEachWindow {

	
	public static int solve(int start,int end,int [] arr) {
		for(int i=start;i<=end;i++) {
			if(arr[i]<0) {
				return arr[i];
			}
		}
		return 0;
	}
	public static ArrayList<Integer> firstNegative(int [] arr,int n,int k){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int i=0;
		int j=0;
		
		while(j<n) {
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				ans.add(solve(i,j,arr));
				i++;
				j++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> list=firstNegative(arr,n,k);
		System.out.println(list);
		sc.close();
	}

}
