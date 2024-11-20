package bitmanipulation;

import java.util.Scanner;

public class RubrikOA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long L=sc.nextLong();
		long R=sc.nextLong();
		long result=0;
		for(int bit=0;bit<64;bit++) {
			
			//check if the current bit in L is 1.
			
			if((L & (1L << bit))!=0) {
				
				//find the size of block..
				
				long block=1L << bit;
				
				//determine the range of numbers with the current bit is still 1.
				
				long start=(L/block)*block;
				long end=Math.min(start + block - 1, R);
				
				if (start <= R) {
                    result += (end - L + 1) * (1L << bit);
                }
			}
		}
		long MOD=(long)1e9;
		System.out.println(result%MOD);
		sc.close();
		
	}

}
