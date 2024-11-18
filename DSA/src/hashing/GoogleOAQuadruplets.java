package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class GoogleOAQuadruplets {
	
	public static int solve(int [] arr,int n) {
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int k=3;k<=n;k++) {
			for(int l=k+1;l<=n;l++) {
				map.put(arr[k]*arr[l], map.getOrDefault(arr[k]*arr[l], 0)+1);
			}
		}
		
		for(int j=2;j<=n-3;j++) {
			for(int i=1;i<=j-1;i++) {
				int p=arr[i]*arr[j];
				count+=map.getOrDefault(p, 0);
			}
			//remove the pairs from (j+1,j+2).......(j+1,N)
			for(int q=j+2;q<=n;q++) {
				int p=arr[j+1]*arr[q];
				map.remove(p);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n+1];
		int i=1;
		while(i<=n) {
			arr[i]=sc.nextInt();
			++i;
		}
		System.out.println(solve(arr,n));
		sc.close();
	}

}
