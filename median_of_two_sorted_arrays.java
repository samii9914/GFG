package geeks_for_geeks;

import java.util.Scanner;

public class median_of_two_sorted_arrays {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		int []arr2=new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=scn.nextInt();
		}
		if(n>=2&&m>=2)
		{
		int inla=((n-1)/2);
		int inlb=((m-1)/2);
		int l=Math.max(arr1[inla],arr2[inlb]);
		int r=Math.min(arr1[inla+1],arr2[inlb+1]);
		while(l>r&&inla<n&&inlb<m&&inla>=0&&inlb>=0)
		{
			inla--;
			inlb++;
			l=Math.max(arr1[inla],arr2[inlb]);
			r=Math.min(arr1[inla+1],arr2[inlb+1]);
			
		}
		int median=(l+r)/2;
		System.out.println(median);
		}
		else if(n==1&&m==1)
		{
			System.out.println((arr1[0]+arr2[0])/2);
		}
		else if(n==1)
		{
		   int inla=0;
		   int inlb=(m-1)/2;
		   int l=Math.max(arr1[inla],arr2[inlb]);
		   int r=arr2[inlb+1];
				   
				   while(l>r&&inla<n&&inlb<m&&inla>=0&&inlb>=0)
					{
						inlb++;
						l=Math.max(arr1[inla],arr2[inlb]);
						r=Math.min(arr1[inla+1],arr2[inlb+1]);
						
					}
					int median=(l+r)/2;
					System.out.println(median);
		}
		else if(m==1)
		{
			int inla=(n-1)/2;
			   int inlb=0;
			   int l=arr1[inla];
			   int r=Math.min(arr1[inla+1],arr2[inlb]);
			   while(l>r&&inla<n&&inlb<m&&inla>=0&&inlb>=0)
				{
					inla--;
					l=Math.max(arr1[inla],arr2[inlb]);
					r=Math.min(arr1[inla+1],arr2[inlb+1]);
					
				}
				int median=(l+r)/2;
				System.out.println(median);	   
					   
		}
		

	}

}
