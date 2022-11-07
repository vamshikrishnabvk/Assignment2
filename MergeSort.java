package arrays;
import java.util.*;
class MergeSort
{
void conquer(int arr[],int first,int mid,int last) 
	{
		int merged[]=new int[last-first+1];
		int p=first;
		int q=mid+1;
		int k=0;
		
		while (p<=mid&&q<=last)
		{
			if (arr[p]<=arr[q])
			{
		       merged[k++]=arr[p++];
			}
			else 
			{
				merged[k++]=arr[q++];
						
			}
		}
			while (p<=mid)
			{
				merged[k++]=arr[p++];
			}
			while(q<=last)
			{
				merged[k++]=arr[q++];
			}
		
		
	  for(int i=0,j=first;i<merged.length;i++,j++)
	  {
			arr[j]=merged[i];
		  
	  }
	  
	}
void divide(int arr[],int first,int last)
	{
		if(first>=last)
		{
			return;
		}
		int mid=first+(last-first)/2;
		
		divide(arr,first,mid);
		divide(arr,mid+1,last);
		conquer(arr,first,mid,last);
		
	     
	}
	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,55,65,1,99};
		int n=arr.length;
		System.out.println("Before Sorting");
		for(int ele:arr)
		System.out.print(ele +" ");
	
		System.out.println();
		MergeSort m=new MergeSort();		
		m.divide(arr,0,n-1);
		
		
		System.out.println("after sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
			
}

