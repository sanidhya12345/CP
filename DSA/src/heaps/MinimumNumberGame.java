package heaps;

import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;
public class MinimumNumberGame {

	 public int[] numberGame(int[] nums) {
	        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
	        for(int i:nums) minHeap.add(i);
	        int [] ans=new int[nums.length];
	        int index=0;
	        while(!minHeap.isEmpty()){
	          ans[index]=minHeap.poll();
	          index++;
	        }
	        for(int i=0;i<ans.length;i+=2){
	            int temp=ans[i];
	            ans[i]=ans[i+1];
	            ans[i+1]=temp;
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberGame mng=new MinimumNumberGame();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(mng.numberGame(arr)));
		sc.close();
	}

}
