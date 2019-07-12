package geeks_for_geeks;

import java.util.Scanner;

public class max_sum_increasing_subsequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int []same=new int[n];
		for(int i=0;i<n;i++)
		{
			same[i]=arr[i];
		}
		int sum=0;
		for(int i=1;i<n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i]&&same[i]<same[j]+arr[i])
				{
					same[i]=same[j]+arr[i];
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(max<same[i])
			{
				max=same[i];
			}
		}
		System.out.println(max);

	}

}
