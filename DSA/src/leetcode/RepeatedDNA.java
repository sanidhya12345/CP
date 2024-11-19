package leetcode;


import java.util.*;
public class RepeatedDNA {
	
	
	public static List<String> findRepeatedDnaSequences(String s) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    List<String> ans = new ArrayList<String>();
	    int n = s.length();
	    int i = 0;
	    StringBuilder sb = new StringBuilder();
	    
	    while (i + 10 <= n) {  // Ensure there's enough room for a 10-length sequence
	        sb.setLength(0);  // Reset the StringBuilder for each new sequence
	        sb.append(s.substring(i, i + 10));  // Get the 10-character substring
	        
	        if (!map.containsKey(sb.toString())) {
	            map.put(sb.toString(), 1);
	        } else {
	            if (map.get(sb.toString()) == 1) {
	                ans.add(sb.toString());  // Only add when it repeats for the first time
	            }
	            map.put(sb.toString(), map.get(sb.toString()) + 1);
	        }
	        
	        i++;  // Move the window by 1 character
	    }

	    return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(findRepeatedDnaSequences(s));
		sc.close();
	}
}
