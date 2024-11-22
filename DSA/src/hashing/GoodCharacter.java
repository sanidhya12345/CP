package hashing;

import java.util.*;


//contribution technique:
// For each char you can easily count in how many substrings does it occur using the formula:- x*y + x + y + 1 x = left space; y = right space. 

public class GoodCharacter{
	
	public static char solve(String s) {
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		int n=s.length();
		for(int i=0;i<n;i++) {
			int x=i;
			int y=n-i-1;
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+x*y+x+y+1);
		}
		char answer=' ';
		int max=0;
		for(char ch:map.keySet()) {
			int freq=map.get(ch);
			if(max<freq) {
				max=freq;
				answer=ch;
			}
		}
		return answer;
	}
	public static char bruteforce(String s) {
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int l=i;l<=j;l++) {
					char ch=s.charAt(l);
					map.put(ch,map.getOrDefault(ch, 0)+1);
				}
			}
		}
		char answer=' ';
		int max=0;
		for(char ch:map.keySet()) {
			int freq=map.get(ch);
			if(max<freq) {
				max=freq;
				answer=ch;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(solve(s));
		sc.close();
	}
}