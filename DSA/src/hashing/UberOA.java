package hashing;

import java.util.HashMap;
import java.util.Scanner;


public class UberOA {

	//easy version of the problem.
	public static int bruteforce(int [] arr,int n) {
		int total_sum=0;
		int i=0;
		while(i<n) {
			total_sum+=arr[i];
			i++;
		}
		int prefix_sum=0;
		int count=0;
		for(int ele:arr) {
			prefix_sum+=ele;
			
			if(prefix_sum==total_sum/2) {
		       count++;		
			}
		}
		return count;
	}
	//original problem.
	public static int solve(int[] arr, int n) {
	    HashMap<Integer, Integer> prefix = new HashMap<>();
	    HashMap<Integer, Integer> suffix = new HashMap<>();
	    
	    int total_sum = 0;
	    for (int i : arr) total_sum += i;
	    if(total_sum%2!=0) return 0;
	    // Calculate suffix sums from n-1 to 0 and store them in the suffix map
	    int suf_sum = 0;
	    for (int i = n - 1; i >= 0; i--) { 
	        suf_sum += arr[i];
	        suffix.put(suf_sum, suffix.getOrDefault(suf_sum, 0) + 1);
	    }

	    int p_sum = 0;  // Prefix sum
	    int c = 0;      // Count of valid splits

	    for (int i = 0; i < n; i++) { 
	        // Decrement the current suffix sum count
	        suf_sum -= arr[i];
	        suffix.put(suf_sum, suffix.getOrDefault(suf_sum, 0) - 1);
	        if (suffix.get(suf_sum) == 0) suffix.remove(suf_sum);

	        // Compute the remaining total sum excluding the current element
	        int new_sum = total_sum - arr[i];

	        // Check if new_sum is divisible by 2
	        if (new_sum % 2 == 0) {
	            int half_sum = new_sum / 2;

	            // Add valid splits from the prefix and suffix maps
	            c += prefix.getOrDefault(half_sum, 0);
	            c += suffix.getOrDefault(half_sum, 0);
	        }

	        // Update the prefix sum
	        p_sum += arr[i];
	        prefix.put(p_sum, prefix.getOrDefault(p_sum, 0) + 1);
	    }

	    return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n+1];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			++i;
		}
		//bruteforce output
		//System.out.println(bruteforce(arr, n));
		System.out.println(solve(arr, n));
		sc.close();
	}

}
