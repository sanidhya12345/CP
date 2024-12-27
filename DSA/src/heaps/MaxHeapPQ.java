package heaps;

import java.util.*;
public class MaxHeapPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we will pass the comparator inside the constructor so that max element will be the root of heap.
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		maxHeap.add(10);
		maxHeap.add(4);
		maxHeap.add(700);
		maxHeap.add(3);
		
		System.out.println("The max heap is: "+maxHeap);
		
		List<Integer> list=new ArrayList<Integer>();
		
		while(!maxHeap.isEmpty()) {
			list.add(maxHeap.poll());
		}
		//the output will be in the decreasingly sorted order.
		System.out.println(list);
	}

}
