package geeks_for_geeks;

import java.util.Scanner;

public class find_duplicates_in_on_time_and_constant_extra_space {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[java.lang.Math.abs(arr[i])]>0)
			{
				arr[java.lang.Math.abs(arr[i])]=-arr[java.lang.Math.abs(arr[i])];
			}
			else
			{
				System.out.println(java.lang.Math.abs(arr[i]));
			}
		}

	}

	

}
