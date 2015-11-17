public class HeapSort {

	public static void main(String args[])
	{
		int[] a = {7,7,3,2,2,1};
		sort(a);
	}
	
	public static void sort(int[] a )
	{
		MaxHeap heap = new MaxHeap(a.length);
		heap.arr = a;
		heap.heapsize = a.length;
		heap = Maxheapify(heap);
		
		while(heap.heapsize>=1)
		{
			int temp = heap.arr[0];
			heap.arr[0] = heap.arr[heap.heapsize-1];
			heap.arr[heap.heapsize - 1] = temp;
			heap.heapsize--;
			heap.heapify(0);
		}
		for(int i = 0; i<a.length;i++)
			System.out.println(heap.arr[i]);
	}
	
	public static MaxHeap Maxheapify(MaxHeap heap)
	{
		int length = heap.arr.length;
		for(int i = (length - 2)/2; i>=0;i--)
			heap.heapify(i);
		return heap;
	}
}
