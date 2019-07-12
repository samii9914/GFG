package geeks_for_geeks;

import java.util.Arrays;
import java.util.Scanner;

public class chocolate_distribution_problem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int s=scn.nextInt();
		
		Arrays.sort(arr);
		int diff=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		
		for(int i=0;i+s-1<n;i++)
		{
			int d=arr[i+s-1]-arr[i];
			if(d<diff)
			{
				diff=d;
				first=i;
				last=i+s-1;
			}
			
		}
		System.out.println(arr[last]-arr[first]);

	}

}
