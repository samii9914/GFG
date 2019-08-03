package geeks_for_geeks;

public class reverse_a_linked_list {
	class Node
	{
		int data;
		Node next;
		
		Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	Node tail=null;
	public void addnode(int value)
	{
		if(head==null&&tail==null)
		{
			Node temp=new Node(value,null);
			head=temp;
			tail=temp;
			return;
		}
		
		Node node=new Node(value,null);
		tail.next=node;
		tail=node;
	}
	
	public void display()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"=>");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public void reverse()
	{
		Node prev=this.head;
		Node curr=this.head.next;
		while(curr!=null)
		{
			Node tp=prev;
			Node tc=curr;
			prev=curr;
			curr=curr.next;
			tc.next=tp;
		}
		
		Node temp=this.head;
		this.head=this.tail;
		this.tail=temp;
		this.tail.next=null;
		
	}

	public static void main(String[] args) {
		reverse_a_linked_list list=new reverse_a_linked_list();
		list.addnode(1);
		list.addnode(2);
		list.addnode(3);
		list.addnode(4);
		list.addnode(5);
		
		list.display();
		list.reverse();
		list.display();

	}

}
