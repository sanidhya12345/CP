package hashing;


import java.util.*;
public class ConvertArray {

	public  static List<List<Integer>> findMatrix(int[] nums) {
	     List<List<Integer>> ans=new ArrayList<List<Integer>>();
	     
	     HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
	     for(int i:nums) map.put(i,map.getOrDefault(i, 0)+1);
	     
	     while (map.size() != 0) {
	            List<Integer> list = new ArrayList<>();
	            List<Integer> keysToRemove = new ArrayList<>(); // Track keys to be removed
	            
	            // Iterating over the map keys
	            for (int i : map.keySet()) {
	                if (map.get(i) > 0) {
	                    list.add(i);
	                    map.put(i, map.get(i) - 1); // Decrease the count
	                }
	                if (map.get(i) == 0) {
	                    keysToRemove.add(i); // Mark keys for removal
	                }
	            }
	            
	            // Remove keys after the iteration
	            for (int key : keysToRemove) {
	                map.remove(key);
	            }
	            
	            // Add the list to the result
	            ans.add(list);
	        }
	     
	     return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] nums=new int[n];
		int i=0;
		while(i<n) {
			nums[i]=sc.nextInt();
			i++;
		}
		System.out.println(findMatrix(nums));
		sc.close();
	}

}
