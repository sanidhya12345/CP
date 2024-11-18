package hashing;

import java.util.Scanner;

public class SumofAllSubarraysinAP {

	public static int sumsubarrays(int [] b,int n) {
		 int w = 0;  // sum of all array elements
	        for (int i = 1; i <= n; ++i) {
	            w += b[i];
	        }
	 
	        int v = 0;
	        int c = 0;
	        int prv = 0;
	        int answer = 0;
	 
	        for (int i = 1; i <= n; ++i) {
	            if (i == 1) {
	                v = v + b[i];
	                prv = b[i];
	            } else {
	                if (b[i] - b[i - 1] == 1) {
	                    c = c + 1;
	                    v = prv + b[i] * (c + 1);
	                    prv = v;
	                } else {
	                    v = b[i];
	                    c = 0;
	                    prv = b[i];
	                }
	            }
	 
	            answer = answer + v;  // sum of all valid subarrays ending at index i
	        }
	 
	        // Reset variables for the second loop
	        v = 0;
	        c = 0;
	        prv = 0;
	 
	        for (int i = 1; i <= n; ++i) {
	            if (i == 1) {
	                v = v + b[i];
	                prv = b[i];
	            } else {
	                if (b[i] - b[i - 1] == 0) {
	                    c = c + 1;
	                    v = prv + b[i] * (c + 1);
	                    prv = v;
	                } else {
	                    v = b[i];
	                    c = 0;
	                    prv = b[i];
	                }
	            }
	 
	            answer = answer + v;  // sum of all valid subarrays ending at index i
	        }
	 
	        answer = answer - w;
	        return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n+1];
		int i=1;
		while(i<=n) {
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println(sumsubarrays(arr,n));
		sc.close();
	}

}
