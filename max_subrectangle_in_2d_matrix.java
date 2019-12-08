package geeks_for_geeks;

import java.util.Scanner;

public class max_subrectangle_in_2d_matrix {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		
		while(t>0)
		{
			int r=scn.nextInt();
			int c=scn.nextInt();
			int [][]arr=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					arr[i][j]=scn.nextInt();
				}
			}
			
			System.out.println(maxsum(arr,r,c));
			t--;
		}

	}
	public static int maxsum(int [][]arr,int r,int c)
	{
		int max_sum=Integer.MIN_VALUE;
		for(int L=0;L<c;L++)
		{
			int []a=new int[r];
			
			for(int R=L;R<c;R++)
			{
				for(int i=0;i<r;i++)
				{
					a[i]+=arr[i][R];
				}
				
				int ans=Kadanes_Algorithm(a,r);
				if(ans>max_sum)
				{
					max_sum=ans;
				
				}
			}
		}
		return max_sum;
	}
	public static int Kadanes_Algorithm(int []arr,int r)
	{
		int max_so_far=Integer.MIN_VALUE;
		int max_ending_here=0;
		for(int i=0;i<r;i++)
		{
			max_ending_here+=arr[i];
			if(max_ending_here>max_so_far)
			{
				max_so_far=max_ending_here;
				
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
				
			}
		}
		return max_so_far;
	}

}
