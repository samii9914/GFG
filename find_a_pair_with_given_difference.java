package geeks_for_geeks;

import java.util.Arrays;
import java.util.Scanner;


public class find_a_pair_with_given_difference {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		
		int diff=scn.nextInt();
		
		for(int i=n-1;i>=0;i--)
		{
			int s=0;
			int e=n-1;
			while(s<e)
			{
				int mid=(s+e)/2;
				if(java.lang.Math.abs(arr[i]-arr[mid])==diff)
				{
					System.out.println(arr[i]+" "+arr[mid]);
					return;
				}
				else if(java.lang.Math.abs(arr[i]-arr[mid])<diff)
				{
					e=mid-1;
					
				}
				else
				{
					s=mid+1;
				}
			}
		}
		System.out.println("no pair exist");
		
	}

}
