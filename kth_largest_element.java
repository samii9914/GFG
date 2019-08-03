package geeks_for_geeks;

import java.util.Scanner;

public class kth_largest_element {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int k=scn.nextInt();
		func(arr,k,0,arr.length-1);

	}
	public static void func(int []arr,int k,int low,int high)
	{
		int pivot=partition(arr,low,high);
		if((high-pivot)==(k-1))
		{
			System.out.println(arr[pivot]);
			return;
		}
		else if((high-pivot)>k-1)
		{
			func(arr,k,pivot+1,high);
		}
		else
		{
			func(arr,k-(high-pivot+1),low,pivot-1);
		}
	}
	public static int partition(int []arr,int l,int h)
	{
		int pivot=arr[h];
		int pi=l;
		for(int i=l;i<h;i++)
		{
			if(arr[i]<pivot)
			{
				int temp=arr[pi];
				arr[pi]=arr[i];
				arr[i]=temp;
				pi++;
			}
		}
		
		int temp=arr[h];
		arr[h]=arr[pi];
		arr[pi]=temp;
		return pi;
		
		
	}

}
