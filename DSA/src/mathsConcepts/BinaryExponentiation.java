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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		System.out.println(binaryPow(a, b));
		sc.close();
	}

}
