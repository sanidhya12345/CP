package slidingwindow;

import java.util.*;
class Pair{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public static Pair helper(List<Pair> p,int target,int n){
       
       int i=0;
       int j=n-1;
       
       while(i<j){
           
           int sum=p.get(i).first+p.get(j).first;
           
           if(sum==target){
               return new Pair(p.get(i).second,p.get(j).second);
           }
           else if(sum>target){
               j--;
           }
           else{
               i++;
           }
       }
       return new Pair(-1,-1);
        
    }
    public List<Integer> findPair(int arr[], int target) {
        // Your code here
        List<Integer> list=new ArrayList<>();
        List<Pair> pairs=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            pairs.add(new Pair(arr[i],i));
        }
        pairs.sort(Comparator.comparingInt(a -> a.first));
        
        Pair ans=helper(pairs,target,n);
        if(ans.first!=-1 && ans.second!=-1){
            list.add(arr[ans.first]);
            list.add(arr[ans.second]);
        }
        return list;
    }
}
public class FindPairWithSumTarget {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-49, 75, 103, -147, 164, -197, -238, 314, 348, -422};
		int target=167;
		Solution obj=new Solution();
		System.out.println(obj.findPair(arr, target));
	}

}
