package DataStructures;


public class Stack 
{
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
		
		private Node top;
		
		public boolean isEmpty()
		{
			return top==null;
		}
		
		public int peek()
		{
			if (top != null)return top.data;
			return (Integer) null;
		}
		
		public void push(int data)
		{
			Node node = new Node(data);
			node.next=top;
			top=node;
		}

		public int pop()
		{
			int data = top.data;
			top=top.next;			
			return data;
		}
		 
		public void printstack()
		{
			Node n = top;
			
			while(n != null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			
		}
		
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.printstack();
		
				

	}

}
