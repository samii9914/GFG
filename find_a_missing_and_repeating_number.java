package geeks_for_geeks;

import java.util.Arrays;
import java.util.Scanner;

public class find_a_missing_and_repeating_number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int missing=0;
		int repeating=0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				repeating=arr[i];
			}
		}
		
		int total=(n*(n+1))/2;
		
		for(int i=0;i<n;i++)
		{
			total=total-arr[i];
		}
		if(repeating!=0)
		{
			System.out.println("Missing:"+(total+repeating)+" Repeating:"+repeating);
		}
		else
		{
			System.out.println("No such elements");
		}
		

	}

}
