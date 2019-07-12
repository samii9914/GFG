package geeks_for_geeks;

import java.util.Scanner;

public class searching_array_adjacent_differ_k {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int x=scn.nextInt();
		int k=scn.nextInt();
		
		int i=0;
		while(i<n)
		{
			if(arr[i]==x)
			{
				System.out.println(i);
				return;
			}
			i=i+Math.max(1,(arr[i]-x)/k);
		}
		
		System.out.println("Element not found");
		

	}

}
