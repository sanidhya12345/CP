package bitmanipulation;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n & 1)==0) {
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}

}
