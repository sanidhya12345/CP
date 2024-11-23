package codeforces;

import java.util.*;

public class ArdentFlames {
	
	public static long minAttacks(long [] h,long [] x, int n,int m, int k) {
		long low=0;
		
		long maxHealth=Long.MAX_VALUE;
		for(long i:h) maxHealth=Math.max(maxHealth,i);
		long high= maxHealth;
		while(high-low>1) {
			long mid=(low+high)/2;
			
			//Now we will store the ranges for the shooter to hit the target.
			
			TreeMap<Long, Long> ranges=new TreeMap<Long, Long>();
			
			for(int i=0;i<n;i++) {
				
				long t=(h[i]+mid-1)/mid;
				
				if(t>m) continue;
				
				long start=(x[i]-m+t);
				long end=(x[i]+m-t+1);
				
				ranges.put(start,ranges.getOrDefault(start, 0L)+1);
				ranges.put(end,ranges.getOrDefault(end, 0L)-1);
			}
			List<Long> keys = new ArrayList<>(ranges.keySet());
	        Collections.sort(keys);
			long active=0;
			boolean isValid=false;
			
			for (long key : keys) {
                active += ranges.get(key);
                if (active >= k) {
                    high = mid;
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                low = mid;
            }
        }
		return high == maxHealth ? -1 : high;
	}
	public static void solve(Scanner sc) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		long [] h=new long[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextLong();
		}
		long [] x=new long[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextLong();
		}
		System.out.println(minAttacks(h, x, n, m, k));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test--!=0) {
			solve(sc);
		}
	}
}
