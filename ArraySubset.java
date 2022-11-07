package arrays;
import java.util.*;
public class ArraySubset {
	
 static boolean subset(int arr1[],int arr2[],int m,int n) {
	 int j=0;
	 int i=0;
	for(i=0;i<n;i++) {
		for (j=0;j<m;j++)
			if (arr2[i]==arr1[j]) 
				break;	
		if (j==m) 
			return false;
		
		
	}
	return true;
	
}
 

	public static void main(String[] args) {
		int arr1[]= {3,6,8,2,7,9,1};
		int arr2[]= {1,8,6,3};
		int m=arr1.length;
		int n=arr2.length;
		
		
		if (subset(arr1,arr2,m,n) )
			System.out.println("arr1[]  is subset of arr2[]");
		else
			System.out.println("arr1[] is not subset of arr2[]");

	}

}

