package heaps;

public class MaxHeap {
	private int [] heap;
	private int maxsize;
	private int size;
	
	private static final int FRONT=1;
	public MaxHeap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		heap=new int[this.maxsize+1];
		heap[0]=Integer.MAX_VALUE;
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
	
	private void maxHeapify(int index) {
		if(!isLeaf(index)) {
			int swapIndex=index;
			
			if(right(index)<=size) {
				
				swapIndex=heap[left(index)]<heap[right(index)]?left(index):right(index);
			}
			else {
			   swapIndex=left(index);
			}
			
			if(heap[index]<heap[left(index)] || heap[index]<heap[right(index)]) {
				swap(index,swapIndex);
				maxHeapify(swapIndex);
			}
		}	
	}
	
	public void insert(int element) {
		if(size>=maxsize) {
			return ;
		}
		heap[++size]=element;
		int curr=size;
		
		while(heap[curr]>heap[parent(curr)]) {
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
		maxHeapify(FRONT);
		return popped;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Max Heap is ");
		
		MaxHeap maxHeap=new MaxHeap(15);
		
		maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        
        maxHeap.print();
        
        System.out.println("The Max val is "+maxHeap.remove());
	}

}
