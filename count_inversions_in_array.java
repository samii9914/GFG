package geeks_for_geeks;

import java.util.Scanner;

public class count_inversions_in_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int count=ms(arr,0,arr.length-1);
		System.out.println(count);
	}
	public static int ms(int []arr,int l,int h)
	{
		if(l>h)
		{
			return 0;
		}
		
		int mid=(l+h)/2;
		int ans=ms(arr,l,mid)+ms(arr,mid+1,h)+merge(arr,l,h,mid);
		return ans;
	}
	public static int merge(int[]arr,int l,int h,int mid)
	{
		int count=0;
		int i=l;
		int j=mid;
			while(i<=mid-1&&j<=h)
			{
				if(arr[i]>arr[j])
				{
					count+=mid-i;
					j++;
				}
				else
				{
					i++;
				}
			}
			return count;
	}

}
