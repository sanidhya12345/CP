package hackerrank;

import java.util.Scanner;

public class Encryption {

	public static String encryption(String s) {
        s = s.replaceAll("\\s", "");
        int n = s.length();
        int x = (int) Math.floor(Math.sqrt(n));
        int y = (int) Math.ceil(Math.sqrt(n));

        if (x * y < n) {
            x++;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < y; i++) {
            StringBuilder s1 = new StringBuilder();
            for (int j = i; j < n; j += y) {
                s1.append(s.charAt(j));
            }
            ans.append(s1).append(" ");
        }

        return ans.toString().trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(encryption(s));
		sc.close();
	}

}
