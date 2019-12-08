package geeks_for_geeks;

import java.util.Scanner;
import java.util.Stack;

public class histogram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []hist=new int[n];
		for(int i=0;i<n;i++)
		{
			hist[i]=scn.nextInt();
		}
		
		area_under_histogram(hist);

	}
	public static void area_under_histogram(int []hist)
	{
		int area=0;
		int max=0;
		Stack<Integer> s=new Stack<>();
		int i=0;
		for(i=0;i<hist.length;i++)
		{
			if(s.empty()||hist[s.peek()]<hist[i])
			{
				s.push(i);
			}
			else
			{
				int tp=s.peek();
				s.pop();
				area=hist[i]*(s.empty()?i:i-s.peek()-1);
				if(max<area)
				{
					max=area;
				}
			}
			i++;
		}
		
		while(!s.isEmpty())
		{
			int tp=s.pop();
			area=hist[tp]*(s.empty()?i:i-s.peek()-1);
			if(area>max)
			{
				max=area;
			}
		}
		System.out.println(max);
		
	}

}
