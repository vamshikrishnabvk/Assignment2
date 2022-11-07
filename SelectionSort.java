package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {7,3,6,2,5,1,4};
		System.out.println("Before Sorting");
		for(int ele:arr)
			System.out.print(ele+" ");
		
		for (int i=0;i<arr.length-1;i++) 
		{
			int small=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[small])
				{
					small=j;
				}
			}
			int temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;

		}
	System.out.println();
	System.out.println("After sorting");
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
