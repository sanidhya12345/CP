package gametheory;

import java.util.Scanner;

public class TowerReserarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int fs=0;
        for(int i=0;i<n-1;i++) {
        	fs+=Math.abs(Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i+1)));
        }
        int goal=n-1;
        int vl=goal-fs;
        if(vl%3==0) {
        	System.out.println("P2 Wins");
        }
        else {
        	System.out.println("P1 Wins");
        }
        sc.close();
	}

}
