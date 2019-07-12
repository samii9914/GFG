package geeks_for_geeks;

import java.util.Scanner;

public class max_product_subarray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int max_so_far=1;
		int max_ending_here=1;
		int min_ending_here=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				max_ending_here*=arr[i];
				min_ending_here=Math.min(min_ending_here*arr[i], 1);
			}
			else if(arr[i]==0)
			{
				max_ending_here=1;
				min_ending_here=1;	
			}
			else
			{
				int temp=max_ending_here;
				max_ending_here=Math.max(min_ending_here*arr[i], 1);
				min_ending_here=temp*arr[i];
			}
			
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
			}
		}
		
		System.out.println(max_so_far);

	}

}
