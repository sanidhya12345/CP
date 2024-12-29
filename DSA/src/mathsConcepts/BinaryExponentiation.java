package mathsConcepts;

import java.util.*;
public class BinaryExponentiation {

	//recursive code:
	public static long binaryPow(long a,long b) {
		if(b==0) {
			return 1;
		}
		long res=binaryPow(a, b/2);
		if(b%2==0) {
			return res*res;
		}
		else {
			return res*res*a;
		}
	}
	//iterative code:
	public static long binPow(long a,long b) {
		long res=1;
		
		while(b>0) {
			if((b & 1)!=0) {
				res=res*a;
			}
			a=a*a;
			b>>=1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		System.out.println(binaryPow(a, b));
		System.out.println(binPow(a, b));
		sc.close();
	}

}
