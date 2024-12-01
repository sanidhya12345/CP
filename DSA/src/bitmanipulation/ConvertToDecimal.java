package bitmanipulation;

import java.util.Scanner;

public class ConvertToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int length=s.length();
		int i=0;
		int num=0;
		int p2=1;
		for(i=length-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				num+=p2;
			}
			p2=p2*2;
		}
		System.out.println(num);
		sc.close();
	}

}
