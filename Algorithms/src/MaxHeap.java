
public class MaxHeap {
	int capacity;
	int heapsize;
	int[] arr;
	public MaxHeap(int c)
	{
		capacity = c;
		heapsize = 0;
		arr = new int[c];
	}
	
	public int parent(int i)
	{
		return (i-1)/2;
	}
	public int left(int i)
	{
		return (2*i+1);
	}
	public int right(int i)
	{
		return (2*i+2);
	}
	public void insert(int val)
	{
		if(heapsize == capacity)
			System.out.print("Heap full");
		else
		{
			heapsize++;
			int i = heapsize-1;
			arr[i] = val;
			while(i!=0&& arr[parent(i)]<arr[i])
			{
				int temp = arr[parent(i)];
				arr[parent(i)] = arr[i];
				arr[i] = temp;
				i = parent(i);
			}
		}
	}
	
	public void heapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int max = i;
		if(l<heapsize && arr[l]> arr[i])
			max = l;
		if(r<heapsize && arr[r] > arr[max])
			max = r;
		if(max != i)
		{
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			heapify(max);
		}
	}
}
