package bitmanipulation;

import java.util.*;
public class TikTokOA {
	
	public static long linearSearch(long [] b,long n,long k) {
        for(long i=1;i<=1023;i++) {
        	if(fun(i, b, n)<k) {
        		i++;
        	}
        	else {
        		return i;
        	}
        }
        return -1;
	}
	public static long binarySearch(long [] b,long n,long k) {
		long low=1;
		long high=1023;
		long res=-1;
		while(low<=high) {
			long mid=(low+high)/2;
			if(fun(mid, b, n)<k) {
				low=mid+1;
			}
			else {
				res=mid;
				high=mid-1;
			}
		}
		return res;
	}
	public static long fun(long val,long [] b,long n) {
		long[][] prefix = new long[9][(int) n];
        for (int bit = 0; bit < 9; bit++) { // Use 9 bits
            for (int i = 0; i < n; i++) {
                long is_set = (b[i] >> bit) & 1; // Check if `bit` is set in b[i]
                prefix[bit][i] = is_set + (i > 0 ? prefix[bit][i - 1] : 0);
            }
        }
        long count = 0;
        for (int i = 0, j = 0; j < n; j++) {
            long OR = orc(prefix, i, j); // Calculate OR for range [i, j]
            while (OR > val) {
                i++;
                OR = orc(prefix, i, j); // Recalculate OR after moving `i`
            }
            count += (j - i + 1); // Add subarrays ending at `j` starting from `i`
        }
		return count;
	}
	public static long orc(long[][] prefix, int i, int j) {
        long result = 0;
        for (int bit = 0; bit < 9; bit++) { // Use 9 bits
            // Count of 1s in the `bit` position from index i to j
            long count = prefix[bit][j] - (i > 0 ? prefix[bit][i - 1] : 0);
            if (count > 0) {
                result |= (1L << bit); // Add 2^bit to the result
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] b = new long[(int) n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        
        //using linear search
        System.out.println(linearSearch(b, n, k));
        
        //using binary search
        
        System.out.println(binarySearch(b, n, k));
        sc.close();
	}

}
