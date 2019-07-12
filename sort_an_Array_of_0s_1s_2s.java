package geeks_for_geeks;

import java.util.Scanner;

public class sort_an_Array_of_0s_1s_2s {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		/*int freq[]=new int [3];
		
		for(int i=0;i<freq.length;i++)
		{
			freq[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			freq[arr[i]]+=1;
		}
		
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i]+freq[i-1];
		}
		
		int ans[]=new int[n];
		
		for(int i=n-1;i>=0;i--)
		{
			ans[freq[arr[i]]-1]=arr[i];
			freq[arr[i]]--;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}*/
		
		
		int low=0;
		int hi=arr.length-1;
		int mid=0;
		int temp=0;
		while(mid<hi)
		{
			switch(arr[mid])
			{
			case 0:
			{
				temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;
				low++;
				break;
			}
			case 1:
			{
				mid++;
				break;
			}
			case 2:
			{
				temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
				hi--;
				break;
			}
			
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
