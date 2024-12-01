package bitmanipulation;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping values are look like: ");
		System.out.print(a+" "+b);
		a=a ^ b;
		b=a ^b;
		a=a^b;
		System.out.println();
		System.out.println("After swapping values are look like: ");
		System.out.print(a+" "+b);
		
		
	}

}
