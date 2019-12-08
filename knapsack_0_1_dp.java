package geeks_for_geeks;

import java.util.Scanner;

public class knapsack_0_1_dp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []wt=new int[n];
		int []val=new int[n];
		for(int i=0;i<n;i++)
		{
			wt[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			val[i]=scn.nextInt();
		}
		sort(val,wt);
		int total=scn.nextInt();
		int [][]T=new int[n][total+1];
		for(int row=0;row<T.length;row++)
		{
			for(int col=0;col<=total;col++)
			{
				if(col==0)
				{
					T[row][col]=0;
				}
				else
				{
					if(row==0)
					{
						if(col<val[row])
						{
							T[row][col]=0;
						}
						else
						{
							T[row][col]=val[row];
						}
					}
					else
					{
					if(col>=wt[row])
					{
					T[row][col]=Math.max(val[row]+T[row-1][col-wt[row]],T[row-1][col]);
					}
					else
					{
						T[row][col]=T[row-1][col];
					}
					}
				}
			}
		}
		
		for(int i=0;i<T.length;i++)
		{
			for(int j=0;j<T[0].length;j++)
			{
				System.out.print(T[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(T[n-1][total]);
		

	}
	public static void sort(int []wt,int []val)
	{
		for(int times=0;times<wt.length;times++)
		{
			for(int i=0;i<wt.length-times-1;i++)
			{
				if(wt[i]>wt[i+1])
				{
					int temp=wt[i];
					wt[i]=wt[i+1];
					wt[i+1]=temp;
					
					temp=val[i];
					val[i]=val[i+1];
					val[i+1]=temp;
				}
			}
		}
	}

}
