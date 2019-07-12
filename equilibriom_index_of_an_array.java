package geeks_for_geeks;

import java.util.Scanner;

public class equilibriom_index_of_an_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int sum=0;
		int leftsum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		
		for(int i=0;i<n;i++)
		{
			sum=sum-arr[i];//right part of the array
			if(leftsum==sum)
			{
				System.out.println(i);
				break;
			}
			leftsum=leftsum+arr[i];
		}

	}

}
