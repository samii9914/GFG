package geeks_for_geeks;

import java.util.Scanner;

public class largest_subarray_of_equal_number_of_0s_And_1s {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int sum=0;
		int startindex=0;
		int maxsize=-1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==0)
			{
				sum=-1;
			}
			else
			{
				sum=1;
			}
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==0)
				{
					sum+=-1;
				}
				else
				{
					sum+=1;
				}
				
				if(sum==0&&maxsize<j-i+1)
				{
					maxsize=j-i+1;
					startindex=i;
				}
			}
			
		}
		if(maxsize==-1)
		{
			System.out.println("No such array is present");
		}
		else
		{
			int endindex=startindex+maxsize-1;
			System.out.println(startindex + " to "+endindex);
		}

	}

}
