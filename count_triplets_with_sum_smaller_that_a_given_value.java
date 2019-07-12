package geeks_for_geeks;

import java.util.Scanner;

public class count_triplets_with_sum_smaller_that_a_given_value {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int sum=scn.nextInt();
		int ans=0;
		
		for(int i=0;i<n-2;i++)
		{
			int j=i+1;
			int k=n-1;
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k]>=sum)
				{
					k--;
				}
				else
				{
					ans=ans+(k-j);
					j++;
				}
			}
		}
		System.out.println(ans);

	}

}
