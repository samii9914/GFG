package geeks_for_geeks;

import java.util.Scanner;

public class merge_two_sorted_arrays {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []one=new int[n];
		for(int i=0;i<n;i++)
		{
			one[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		int []two=new int[m];
		for(int i=0;i<m;i++)
		{
			two[i]=scn.nextInt();
		}
		
		int []ans=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n&&j<m)
		{
			if(one[i]<two[j])
			{
				ans[k]=one[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=two[j];
				k++;j++;
			}
		}
		
		while(i<n)
		{
			ans[k]=one[i];
			k++;i++;
		}
		
		while(j<m)
		{
			ans[k]=two[j];
			k++;
			j++;
		}
		
		for(int in=0;in<ans.length;in++)
		{
			System.out.print(ans[in]+" ");
		}
	

	}

}
