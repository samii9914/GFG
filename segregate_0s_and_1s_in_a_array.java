package geeks_for_geeks;

import java.util.Scanner;

public class segregate_0s_and_1s_in_a_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			while(arr[left]==0&&left<right)
			{
				left++;
			}
			while(arr[right]==1&&left<right)
			{
				right--;
			}
			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
