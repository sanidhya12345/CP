package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Timeinwords {

	
	public static String timeInWords(int h, int m) {
	    // Write your code here
	    
	       HashMap<Integer,String> map=new HashMap<>();
	       map.put(1,"one");
	       map.put(2,"two");
	       map.put(3,"three");
	       map.put(4,"four");
	       map.put(5,"five");
	       map.put(6,"six");
	       map.put(7,"seven");
	       map.put(8,"eight");
	       map.put(9,"nine");
	       map.put(10,"ten");
	       map.put(11,"eleven");
	       map.put(12,"twelve");
	       map.put(13,"thirteen");
	       map.put(14,"fourteen");
	       map.put(15,"quarter");
	map.put(16,"sixteen");
	map.put(17,"seventeen");
	map.put(18,"eighteen");
	map.put(19,"nineteen");
	map.put(20,"twenty");
	map.put(21,"twenty one");
	map.put(22,"twenty two");
	map.put(23,"twenty three");
	map.put(24,"twenty four");
	map.put(25,"twenty five");
	map.put(26,"twenty six");
	map.put(27,"twenty seven");
	map.put(28,"twenty eight");
	map.put(29,"twenty nine");
	map.put(30,"half");
	map.put(31,"thirty one");
	map.put(32,"thirty two");
	map.put(33,"thirty three");
	map.put(34,"thirty four");
	map.put(35,"thirty five");
	map.put(36,"thirty six");
	map.put(37,"thirty seven");
	map.put(38,"thirty eight");
	map.put(39,"thirty nine");
	map.put(40,"forty");
	map.put(41,"forty one");
	map.put(42,"forty two");
	map.put(43,"forty three");
	map.put(44,"forty four");
	map.put(45,"quarter");
	map.put(46,"forty six");
	map.put(47,"forty seven");
	map.put(48,"forty eight");
	map.put(49,"forty nine");
	map.put(50,"fifty");
	map.put(51,"fifty one");
	map.put(52,"fifty two");
	map.put(53,"fifty three");
	map.put(54,"fifty four");
	map.put(55,"fifty five");
	map.put(56,"fifty six");
	map.put(57,"fifty seven");
	map.put(58,"fifty eight");
	map.put(59,"fifty nine");
	map.put(60,"sixty");


	           if(m==0){
	               return map.get(h)+" "+"o' clock";
	           }
	           else if(m>=1 && m<=30){
	               if(m==1){
	                   return "one minute past "+map.get(h);
	               }
	               else if(m==15 || m==30){
	                   return map.get(m)+" past "+map.get(h);
	               }
	               else{
	                   return map.get(m)+" minutes past "+map.get(h);
	               }
	               
	           }
	       int minLeft=60-m;
	       if(m==45){
	           return map.get(minLeft)+" to "+map.get(h+1);
	       }
	       return map.get(minLeft)+" minutes to "+map.get(h+1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(timeInWords(h, m));
		sc.close();
		
	}

}
