package arrays;

public class Duplicates {

	public static void main(String[] args) {
		int arr[]= {2,8,2,9,10,3,8,10,3,9,11};	
		
		System.out.println("duplicate elements are::");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
					System.out.println(arr[j]);
			}
		}

	}

}
