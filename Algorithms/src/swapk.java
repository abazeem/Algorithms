public class swapk {

	public static void main(String args[])
	{
		Node a = new Node(1);
		a = insert(a,2);
		a = insert(a,3);
		a = insert(a,4);
		a = insert(a,5);
		a = swap(a, 6);
		disp(a);
	}
	
	public static void disp(Node x)
	{
		while(x!= null)
		{
			System.out.print(x.val + " ");
			x = x.next;
		}
		return ;
	}
	
	public static Node insert(Node x , int v)
	{
		if ( x == null)
			return new Node(v);
		Node head = x;
		while(x.next!= null)
			x = x.next;
		Node temp = new Node(v); 
		x.next = temp;
		temp.prev = x;
		return head;
	}
	
	public static Node swap(Node head, int k)
	{
		int length = len(head);
		if( k > length)
		{
			System.out.println("K should be less than the list length");
			return null;
		}
		int mid = length/2;
		boolean even = false;;
		boolean odd = false;
		if(length % 2 == 1)
			odd = true;
		else
			even = true;
		if ( odd)
			mid = mid+1;
		if(odd && mid == k)
			return head;
		if ( even && (mid == k || k == mid +1) )
		{
			Node a = null;
			Node b = null;
			if(mid == k)
			{
				a = getnode(head,k);
				b = a.next;
			}
			else if ( k == mid+1)
			{
				a = getnode(head, k-1);
				b = a.next;
			}
			Node a_prev = a.prev;
			Node b_next = b.next;
			if(a_prev != null)
				a_prev.next = b;
			b.prev = b_next;
			a.prev = b;
			b.next = a;
			if(b_next != null)
				b_next.prev = a;
			a.next = b_next;
			return head;
		}
		Node x = head;
		Node a = getnode(x,k);
		Node b = getnode(x, length+1-k);
		Node a_prev = a.prev;
		Node a_next = a.next;
		Node b_prev = b.prev;
		Node b_next = b.next;
		if(a_prev!= null)
			a_prev.next = b;
		b.prev = a_prev;
		b.next = a_next;
		if(a_next != null)
			a_next.prev = b;
		if(b_prev != null)
			b_prev.next = a;
		a.next = b_next;
		a.prev = b_prev;
		if(b_next != null)
			b_next.prev = a;
		while(b.prev != null)
			b = b.prev;
		return b;
	}
	
	public static Node getnode(Node x, int k)
	{
		if ( x == null)
			return null;
		if( k == 0)
			return null;
		while(k>1 && x != null)
		{
			k--;
			x = x.next;
		}
		return x;
	}
	
	public static int len(Node x)
	{
		if( x == null)
			return 0;
		int count = 1;
		while(x.next!=null)
		{
			x = x.next;
			count++;
		}
		return count;
	}
}
