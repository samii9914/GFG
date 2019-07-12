package geeks_for_geeks;

import java.util.Scanner;

public class ceiling_in_a_sorted_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int key=scn.nextInt();
		int floor=-1;
		int ceil=-1;
		if(keypresent(arr,key))
		{
			System.out.println("Floor:"+key+" Ceiling:"+key);
			return;
		}
		else
		{
			floor=getfloorval(arr,key);
			ceil=getceilval(arr,key);
		}
		
		if(floor==-1)
		{
			System.out.print("No floor val ");
		}
		else
		{
			System.out.print("Floor:"+floor);
		}
		if(ceil==-1)
		{
			System.out.print("No ceil val");
		}
		else
		{
			System.out.print(" Ceiling:"+ceil);
		}

	}
	public static boolean keypresent(int[]arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==key)
			{
				return true;
			}
			else if(arr[mid]>key)
			{
				e=mid-1;
			}
			else
			{
				s=mid+1;
			}
		}
		return false;
	}
	public static int getfloorval(int []arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		int ans=-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]<key)
			{
			   ans=arr[mid];
			   s=mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		return ans;
	}
	public static int getceilval(int []arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		int ans=-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]>key)
			{
				ans=arr[mid];
				e=mid-1;
			}
			else
			{
				s=mid+1;
			}
		}
		return ans;
	}

}
