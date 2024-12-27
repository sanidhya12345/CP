package heaps;

public class MinHeap {

	private int [] heap;
	private int maxsize; // maximum size of the heap
	private int size;// current size of the heap
	
	private static final int FRONT=1;
	public MinHeap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		
		heap=new int[this.maxsize+1];
		heap[0]=Integer.MIN_VALUE;
	}
	
	private int parent(int index) {
		return index/2;
	}
	private int left(int index) {
		return 2*index;
	}
	private int right(int index) {
		return 2*index+1;
	}
	
	private boolean isLeaf(int index) {
		return index>(size/2);
	}
	
	private void swap(int first,int second) {
		int temp=heap[first];
		heap[first]=heap[second];
		heap[second]=temp;
	}
	
	private void minHeapify(int index) {
		if(!isLeaf(index)) {
			int swapIndex=index;
			
			//swap with the minimum of the both children
			//to check if the right child exists or not.
			//otherwise the default value will be 0 and that will be swapped with the parent node.
			
			if(right(index)<=size) {
				
				swapIndex=heap[left(index)]<heap[right(index)]?right(index):left(index);
			}
			else {
				swapIndex=left(index);
			}
			
			if(heap[index]>heap[left(index)] || heap[index]>heap[right(index)]) {
				swap(index,swapIndex);
				minHeapify(swapIndex);
			}
		}
	}
	
	public void insert(int element) {
		if(size>=maxsize) {
			return ;
		}
		heap[++size]=element;
		int curr=size;
		while(heap[curr]<heap[parent(curr)]) {
			swap(curr,parent(curr));
			curr=parent(curr);
		}
	}
	public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
 
            // Printing the parent and both childrens
            System.out.print(
                " PARENT : " + heap[i]
                + " LEFT CHILD : " + heap[2 * i]
                + " RIGHT CHILD :" + heap[2 * i + 1]);
 
            // By here new line is required
            System.out.println();
        }
    }
	
	public int remove() {
		int popped=heap[FRONT];
		heap[FRONT]=heap[size--];
		minHeapify(FRONT);
		
		return popped;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("The Min Heap is ");
		 
	        // Creating object of class in main() method
	        MinHeap minHeap = new MinHeap(15);
	 
	        // Inserting element to minHeap
	        // using insert() method
	 
	        // Custom input entries
	        minHeap.insert(5);
	        minHeap.insert(3);
	        minHeap.insert(17);
	        minHeap.insert(10);
	        minHeap.insert(84);
	        minHeap.insert(19);
	        minHeap.insert(6);
	        minHeap.insert(22);
	        minHeap.insert(9);
	 
	        // Print all elements of the heap
	        minHeap.print();
	 
	        // Removing minimum value from above heap
	        // and printing it
	        System.out.println("The Min val is "
	                           + minHeap.remove());
	    }
}
