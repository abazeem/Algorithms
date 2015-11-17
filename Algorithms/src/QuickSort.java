public class QuickSort {

	public static void main(String args[])
	{
		//int[] a = {7,3,9,2,1};
	//	sort(a,0,a.length-1);
	//	for(int i = 0;i<a.length; i++)
		//	System.out.println(a[i] + " ");
		Node x = new Node(30);
		x.next = new Node(10);
		x.next.next = new Node(40);
		x.next.next.next = new Node(20);
		x.next.next.next.next = new Node(10);
		Node last = x;
		while(last.next != null)
			last = last.next;
		quicksort(x,last);
		disp(x);
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
	
	public static int findpivot(int[] a, int l, int r)
	{
		int x = a[r];
		int i = l-1;
		for(int j = l;j<r;j++)
		{
			if(a[j]<x)
			{
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		return i+1;		
	}
	
	public static void sort(int[]a , int l ,int r)
	{
		if(l<r)
		{
			int p = findpivot(a,l,r);
			sort(a,l,p-1);
			sort(a,p+1,r);
		}
	}
	
	
	public static void quicksort(Node head, Node tail)
	{
		if(tail!= null && head!= tail && head != tail.next)
		{
			Node pivot = part(head, tail);
			Node prev = head;
			while(prev.next!= pivot && prev != pivot)
				prev = prev.next;
			quicksort(head,prev);
			quicksort(pivot.next, tail);
		}
	}
	
	public static Node part(Node l, Node r)
	{
		if(l == null || r == null)
			return null;
		Node i = l;
		int x =r.val;
		Node j = l;
		while(j!=r)
		{
			if(j.val<x)
			{
				int temp = i.val;
				i.val = j.val;
				j.val = temp;
				i = i.next;
			}
			j = j.next;
		}
		int temp2 = i.val;
		i.val = r.val;
		r.val = temp2;
		return i;
	}
	
}
