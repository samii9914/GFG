package geeks_for_geeks;

import java.util.Scanner;

public class find_common_elements_three_sorted_arrays {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int []arr1=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=scn.nextInt();
		}
		
		int n2=scn.nextInt();
		int []arr2=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=scn.nextInt();
		}
		
		int n3=scn.nextInt();
		int []arr3=new int[n3];
		for(int i=0;i<n3;i++)
		{
			arr3[i]=scn.nextInt();
		}
		
		int i=0,j=0,k=0;
		while(i<n1&&j<n2&&k<n3)
		{
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
			{
				System.out.println(arr1[i]);
				i++;j++;k++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
			
		
		

	}

}
