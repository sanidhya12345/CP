package bitmanipulation;

import java.util.Scanner;

public class CheckIthBit {

	
	public static boolean checkBitUsingLeftShift(int n,int i) {
		return (n & (1 << i)) !=0;
	}
	public static boolean checkBitUsingRightShift(int n,int i) {
		return ((n>>i) & 1 )!=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		System.out.println(checkBitUsingLeftShift(n, i));
		System.out.println(checkBitUsingRightShift(n, i));
		sc.close();
	}

}
