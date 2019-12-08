package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Scanner;

public class College_Problem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ArrayList<String> pname=new ArrayList<>();
		ArrayList<String> stime=new ArrayList<>();
		ArrayList<String> etime=new ArrayList<>();
		ArrayList<String> val=new ArrayList<>();
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
		   String x=scn.next();
		   pname.set(i,x);
		}
		
		for(int i=0;i<n;i++)
		{
			String x=scn.next();
			stime.set(i,x);
		}
		
		for(int i=0;i<n;i++)
		{
			String x=scn.next();
			etime.set(i,x);
		}
		
		for(int i=0;i<n;i++)
		{
			String x=scn.next();
			val.set(i,x);
		}
		
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int cost=convert_integer(val.get(i));
			int start=convert_integer(stime.get(i));
			int end=convert_integer(etime.get(i));
			
			int fraction=cost/(end-start);
			
		}

	}

}
