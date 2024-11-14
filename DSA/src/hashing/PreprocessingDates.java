package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreprocessingDates {

	public static String generateOutput(String dd,String mm,String yyyy) {
		String ans=yyyy+"-"+mm+"-"+dd;
		return ans;
	}
	public static void solve(ArrayList<String> list,int n) {
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("Jan","01");
		map.put("Feb","02");
		map.put("Mar","03");
		map.put("Apr","04");
		map.put("May","05");
		map.put("Jun","06");
		map.put("Jul","07");
		map.put("Aug","08");
		map.put("Sep","09");
		map.put("Oct","10");
		map.put("Nov","11");
		map.put("Dec","12");
		
		for(String s:list) {
			String [] arr=s.split(" ");
			String dd=arr[0];
			if(dd.length()==1) {
				dd="0"+dd;
			}
			String mm=map.get(arr[1]);
			String yyyy=arr[2];
			System.out.println(generateOutput(dd, mm, yyyy));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> lst=new ArrayList<String>();
		int i=0;
		while(i<n) {
			String s=sc.nextLine();
			lst.add(s);
			++i;
		}
		solve(lst, n);
		sc.close();
		
	}

}
