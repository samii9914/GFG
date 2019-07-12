package geeks_for_geeks;

import java.util.Scanner;

public class convert_array_into_zigzag_fashion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		boolean flag=true;//<
		for(int i=0;i<n-2;i++)
		{
			if(flag)
			{
				if(arr[i]>arr[i+1])
				{
					//swap
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else
			{
				if(arr[i]<arr[i+1])
				{
					//swap
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			flag=!flag;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
