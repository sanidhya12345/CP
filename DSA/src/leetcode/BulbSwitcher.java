package leetcode;

import java.util.Scanner;

public class BulbSwitcher {

	public int bulbSwitch(int n) {
        int s=(int)(Math.floor(Math.sqrt(n)));
        return s;
    }
	public static void main(String[] args) {
		BulbSwitcher b=new BulbSwitcher();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(b.bulbSwitch(n));
		sc.close();
	}

}
