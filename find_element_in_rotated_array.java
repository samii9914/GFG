package geeks_for_geeks;

import java.util.Scanner;

public class find_element_in_rotated_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int key=scn.nextInt();
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==key)
			{
				System.out.println("Element is found at index: "+mid);
				return;
			}
			if(arr[s]<arr[mid])
			{
				if(arr[s]<=key&&key<=arr[mid])
				{
					e=mid-1;
				}
				else
				{
					s=mid+1;
				}
			}
			if(arr[mid]<arr[e])
			{
				if(arr[mid]<key&&key<arr[e])
				{
					s=mid+1;
				}
				else
				{
					e=mid-1;
				}
			}
		}
		System.out.println("element not found");

	}

}
