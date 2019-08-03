package geeks_for_geeks;

import java.util.Scanner;

public class find_local_maxima {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(i==0||i==arr.length-1)
			{
				if(i==0)
				{
				if(arr[i]>arr[i+1])
				{
					System.out.println(arr[i]);
				}
				}
				else
				{
					if(arr[i]>arr[i-1])
					{
						System.out.println(arr[i]);
					}
				}
			}
			else
			{
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
			{
				System.out.println(arr[i]);
			}
			}
		}

	}

}
