package geeks_for_geeks;

import java.util.Scanner;

public class max_sum_such_thyat_no_two_elements_are_adjacent {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int inc=arr[0];
		int excl=0;
		int exclnew;
		for(int i=1;i<n;i++)
		{
			exclnew=(inc>excl)?inc:excl;
			
			inc=excl+arr[i];
			excl=exclnew;
		}
		
		if(inc>excl)
		{
			System.out.println(inc);
		}
		else
		{
			System.out.println(excl);
		}

	}

}
