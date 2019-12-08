package geeks_for_geeks;

import java.util.Scanner;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int max_ending_here=0;
		int max_so_far=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
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
		
		System.out.println(max_so_far);

	}

}
