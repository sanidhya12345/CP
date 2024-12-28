package online_assessment_class;

import java.util.Scanner;

public class PaypalOA {

	
	public static long getMinimumOperations(long [] arr,long n) {
		
		long ops=0;
		
		long last=arr[(int)n-1];
		for(int i=(int)n-2;i>=0;i--) {
			
			if(arr[i]<=last) {
				last=arr[i];
			}
			else {
				if(arr[i]%last==0) {
					long eparts=arr[i]/last;
					ops+=(eparts-1);
					last=arr[i]/eparts;
				}
				else {
					long ueparts=arr[i]/last+1;
					ops+=(ueparts-1);
					last=arr[i]/ueparts;
				}
			}
		}
		return ops;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long []arr=new long[(int)n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		System.out.println(getMinimumOperations(arr, n));
		sc.close();
		
	}

}
