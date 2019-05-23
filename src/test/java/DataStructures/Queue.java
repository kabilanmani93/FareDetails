package DataStructures;

public class Queue {
	
	//FIFO
	private static class Node
	{		
		private Node next;
		private int data;
		private Node(int data)
		{
			this.data=data;
		}
	}
	
	private Node head; // remove from the head
	private Node tail; // add things here
	
	public boolean isEmpty() 
	{
		return head==null;
	}

	public int peek()
	{
		return head.data;
		
	}
	
	public void add(int data)
	{
		Node node = new Node(data);
		
		if(head==null)
		{
			head= node;
		}
		
		if(tail !=null)
		{
			tail.next=node;
			//tail=node;
		}
		
		tail = node;
		
		
		
	}
	
	public int remove()
	{
		int headvalue = head.data;
		head=head.next;
		if(head==null) tail=null;
		return headvalue;
	}
	
	public void printqueue()
	{
		Node n = head;
		
		while(n != null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	
	public static void main(String[] args) 
	{
		
	     Queue queue = new Queue();
	     
	     queue.add(1);
	     queue.add(2);
	     queue.add(3);
	     
	     queue.printqueue();
	     
	     
	}
	
}
