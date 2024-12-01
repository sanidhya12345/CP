package bitmanipulation;

import java.util.Scanner;

public class SetIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		System.out.println(n | (1<<i));
	}

}
