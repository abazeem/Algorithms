public class pairwiseswap {

	public static void main(String args[])
	{
		Node a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(3);
		a.next.next.next = new Node(4);
		a.next.next.next.next = new Node(5);
		a.next.next.next.next.next = new Node(6);
		a = swap1(a);
		disp(a);
	}
	
	public static void disp(Node x)
	{
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
		return;
	}
	
	public static Node swap1(Node head)
	{
		Node x = head;
		int count = 0;
		int flag = 0;
		while( x!= null && x.next != null )
		{
			flag = 0;
			Node temp2 = head;
			if(count == 0)
			{
				flag = 1;
				count++;
				head = head.next;
			}	
			Node temp = x.next.next;
			while( temp2.next != x && temp2 != x)
				temp2 = temp2.next;
			x = swap(x,x.next);
			if(flag == 0)
				temp2.next = x;
			x.next.next = temp;
			x = x.next.next;
		}
		return head;
	}
	
	public static Node swap(Node a, Node b)
	{
		Node last = b.next;
		Node curr = a;
		Node next = null;
		Node prev = null;
		while( curr != last)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
