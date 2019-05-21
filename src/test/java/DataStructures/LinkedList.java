package DataStructures;

import java.util.List;

public class LinkedList 
{
	
	Node head;
	
	//Inner Class
	//Linked List Node
	//made static so that main can access
	static class Node 
	{			
		Node next;
		int data;
		
		//Constructor to create a new node, Next is default initialized by Null
		 Node(int d) {data=d;}
	}

	//traverse
	public void printlist() {
		Node n = head;
		
		while(n != null)
		{
			System.out.println(n.data+ " ");
			n= n.next;
		}
	}
	
	//Mid Node by 2 pointers
	void printmiddle() {
		Node slow_ptr =head;
		Node fast_ptr = head;
		
		if(head != null)
		{
		  while(fast_ptr != null && fast_ptr.next !=null)
		  {
			 slow_ptr= slow_ptr.next;
			 fast_ptr= fast_ptr.next.next;
		  }
		}
		System.out.println("The Mid Element is : " + slow_ptr.data);
	}
	
	//Mid Node by Traversing
	void printmiddle_traversing(){
		int count=0;
		Node m = head;
		
		while (m != null)
		{
			count++;
			m=m.next;
		}		
		
		m = head;
		
		for (int i =1; i <= count/2; i++ )
		{
			m=m.next;
		}
		
		System.out.println("The Mid Number after traversing is " + m.data);
		
	}
	
	//append
	public void append(int data)
	{
		if(head == null) { head = new Node(data);}
		
		Node current = head;
		while (current.next !=null)
		{
			current = current.next;
		}
		
		current.next = new Node(data);		
	}
	
	
	//prepend
	public void prepend(int data)
	{
		if(head == null) { head = new Node(data);}
		
		//create the Node
		Node New_Node = new Node(data);
		New_Node.next = head;
		head = New_Node;		
	}
	
	//deletewithValue
	public void deleteWithValue(int data)
	{
		if (head == null) return;
		if(head.data == data) 
		{
			head = head.next;
			return;
		}		
				
		Node current = head;

		while (current.next !=null)
		{						
			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			
		}		
	}
	
	
	
	public static void main(String[] args) {
		
     LinkedList lList = new LinkedList();
     
     lList.head = new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);
     Node fourth = new Node(4);
     Node fifth = new Node(5);
     
     lList.head.next = second;
     second.next=third;
     third.next =fourth;
     fourth.next=fifth;

     lList.printlist();     
     
     lList.printmiddle();
     lList.printmiddle_traversing();

	}

}

