package geeks_for_geeks;

import java.util.Scanner;

public class rearrange_positive_and_negative_numbers_in_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		rearrange(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	public static void rearrange(int []arr)
	{
		int j=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int pos=j+1;
		int neg=0;
		while(pos<arr.length&&neg<pos&&arr[neg]<0)
		{
			int temp=arr[pos];
			arr[pos]=arr[neg];
			arr[neg]=temp;
			
			pos++;
			neg=neg+2;
		}
	}

}
