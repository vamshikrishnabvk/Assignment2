package arrays;
import java.util.*;

public class Bubblesort {

	public static void main(String[] args) 
	{
		int [] a= {3,6,8,2,1,9,88};
		for (int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		}
		System.out.println("the array after sorting");
		for (int el:a)
		{
		System.out.print(el+ " ");
		}
	}

}

