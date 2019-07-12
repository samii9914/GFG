package geeks_for_geeks;

import java.util.Scanner;

public class max_sum_of_iarri_among_all_rotations {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int cum_sum=0;
		for(int i=0;i<n;i++)
		{
			cum_sum+=arr[i];
		}
		int curr_val=0;
		for(int i=0;i<n;i++)
		{
			curr_val+=i*arr[i];
		}
		int res=curr_val;
		for(int i=1;i<n;i++)
		{
			int next_val=curr_val-(cum_sum-arr[i-1])+arr[i-1]*(n-1);
			curr_val=next_val;
			res=Math.max(res,next_val);
		}
		
		System.out.println(res);
	}

}
