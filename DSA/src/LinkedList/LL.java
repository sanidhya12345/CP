package LinkedList;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
public class LL {
	public Node head=null;
	public void insertNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
		newNode.next=null;
	}
	public void display() {
		Node curr=head;
		
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		LL obj=new LL();
		for(int i=1;i<=5;i++) {
			obj.insertNode(i);
		}
		obj.display();
	}
}
