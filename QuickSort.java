package arrays;

public class QuickSort {
	int partition(int arr[],int start,int end)
	{
		int pivot=arr[end];
		int i=start-1;
		
		for(int j=start;j<end;j++)
		{
			if (arr[j]<pivot)
			{
				i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			   
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[end]=temp;
		return i;
	}
	
	void sort(int arr[],int start,int end)
	{
		if(start<end)
		{
		int pi=partition(arr, start, end);
	    sort(arr, start, pi-1);
	    sort(arr, pi+1, end);
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,6,2,8,1,99,-1};
		int n=arr.length;
		System.out.println("before Sorting");
		for(int ele:arr)
			System.out.print(ele+" ");
				QuickSort s=new QuickSort();
				s.sort(arr,0,n-1);
				//print
				System.out.println();
				System.out.println("after Sorting");
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
	}

}
