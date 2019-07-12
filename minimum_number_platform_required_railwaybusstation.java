package geeks_for_geeks;

import java.util.Arrays;
import java.util.Scanner;

public class minimum_number_platform_required_railwaybusstation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arrival=new int[n];
		int []dept=new int[n];
		for(int i=0;i<n;i++)
		{
			arrival[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			dept[i]=scn.nextInt();
		}
		
		Arrays.sort(arrival);
		Arrays.sort(dept);
		int platforms=1;
		int result=1;
		int i=1,j=0;
		
		while(i<n&&j<n)
		{
			if(arrival[i]<=dept[j])
			{
				platforms++;
				i++;
				if(platforms>result)
				{
					result=platforms;
				}
			}
			else
			{
				platforms--;
				j++;
			}
		}
		System.out.println(result);

	}

}
