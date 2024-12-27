package heaps;

import java.util.*;
public class MinHeapPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by default priority queue is implemented in min heap.
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		
		minHeap.add(12);
		minHeap.add(11);
		minHeap.add(1);
		minHeap.add(45);
		
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Min Heap is: "+minHeap);
		
		//when we are removing the elements from the min heap it will returns the element in the sorted order.
		while(!minHeap.isEmpty()) {
			list.add(minHeap.poll());
		}
		System.out.println(list);
	}

}
