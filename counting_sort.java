package geeks_for_geeks;

import java.util.Scanner;

public class counting_sort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int []count=new int[256];
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			count[arr[i]]+=1;
		}
		
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		int []ans=new int[n];
		
		for(int i=n-1;i>=0;i--)
		{
			ans[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

}
