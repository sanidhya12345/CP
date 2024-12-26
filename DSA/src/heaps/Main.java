package heaps;

import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Heap<Integer> heap=new Heap<Integer>();
		heap.insert(34);
		heap.insert(45);
		heap.insert(22);
		heap.insert(89);
		heap.insert(76);
		
		ArrayList<Integer> ans=heap.heapsort();
		System.out.println(ans);
	}
}
