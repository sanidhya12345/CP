package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class GoogleOA {

	public static int solve(String s,String r) {
		HashMap<Character, Integer> smap=new HashMap<Character, Integer>();
		HashMap<Character, Integer> rmap=new HashMap<Character, Integer>();
		
		for(char ch:s.toCharArray()) {
			smap.put(ch,smap.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:r.toCharArray()) {
			rmap.put(ch,rmap.getOrDefault(ch, 0)+1);
		}
		int finalcost=0;
		for(char ch='a'; ch<='z';ch++) {
			if(smap.getOrDefault(ch,0)>rmap.getOrDefault(ch, 0)) {
				finalcost+=Math.abs(smap.getOrDefault(ch,0)-rmap.getOrDefault(ch, 0));
			}
		}
		return finalcost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			String r=sc.next();
			System.out.println(solve(s, r));
		}
		sc.close();
	}

}
