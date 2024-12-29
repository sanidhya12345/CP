package mathsConcepts;


import java.util.*;
public class ModularExponentiation {

	private static final Scanner sc=new Scanner(System.in);
	
	
	private static long modPow(long a,long b,long mod) {
		long res=1;
		
		while(b>0) {
			
			if((b & 1)!=0) {
				res=(res*a)%mod;
			}
			a=(a*a)%mod;
			b>>=1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=sc.nextLong();
		long b=sc.nextLong();
		long mod=(long)1e9;
		System.out.println(modPow(a, b, mod));
	}

}
