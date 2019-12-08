package geeks_for_geeks;

import java.util.Scanner;

public class Merge_two_array_of_size_m_and_mplusn {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int []arr1=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=scn.nextInt();
		}
		
		int []arr2=new int [m+n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=scn.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			int key=arr1[i];
			int j=n+i-1;
			for(;j>=0;j--)
			{
				if(key<arr2[j])
				{
					arr2[j+1]=arr2[j];
				}
				else
				{
					break;
				}
				
			}
			arr2[j+1]=key;
		}
		
		for(int i=0;i<m+n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
