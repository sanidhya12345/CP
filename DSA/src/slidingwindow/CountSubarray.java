package slidingwindow;
import java.util.*;

public class CountSubarray{
    
    public static int solve(int [] arr,int n,int target){
         int res=0;
	 
	 //iterate through each element as the first element of the triplet
	 
	 for(int i=0;i<n-2;i++){
	 
	    int left=i+1,right=n-1;

	    while(left<right){
	        int sum=arr[i]+arr[left]+arr[right];

		// if the sum if smaller move to big values.
		if(sum<target){
		    left+=1;
		}
		// if the sum is bigger move to smalles values.
		else if(sum>target){
		    right-=1;
		}

		// if the sum is equal check for the frequencies of the elements.
		else if(sum==target){
		    int ele1=arr[left];
		    int ele2=arr[right];
		    int cnt1=0;
		    int cnt2=0;

		    //count the frequency of the current element at left.
		    while(left<=right && arr[left]==ele1){
		        left++;
			cnt1++;
		    }

		    //count the frequrncy of the current element at right.
		    while(left<=right && arr[right]==ele2){
		        right--;
			cnt2++;
		    }

		    // if both the elements is same then count of pairs= the number of ways to select two elements from cnt1 elements


		     if(ele1==ele2){
		     
		        res+=(cnt1*(cnt1-1))/2;
		     }
		     else{
		         res+=(cnt1*cnt2);
		     
		     }
		}
	    
	    }
	 
	 }
	 return res;
    }
    public static void main(String[] args){
   	  Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
	 int target=sc.nextInt();
    	 int [] arr=new int[n];

     	for(int i=0;i<n;i++){
       	  arr[i]=sc.nextInt();
     	}
	System.out.println(solve(arr,n,target));
   }

}
