package geeks_for_geeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class majority_element {

	public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 int n=scn.nextInt();
	 int []arr=new int[n];
	 int k=Integer.MIN_VALUE;
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=scn.nextInt();	
		 if(arr[i]>k)
		 {
			 k=arr[i];
		 }
	 }
	 
	 HashMap<Integer,Integer> map=new HashMap<>();
	 
	 for(int i=0;i<n;i++)
	 {
		 if(map.containsKey(arr[i]))
		 {
			 int count=map.get(arr[i])+1;
			 if(count>n/2)
			 {
				 System.out.println("Majority element is "+arr[i]);
				 return;
			 }
			 
		 }
		 else
		 {
			 map.put(arr[i],1);
		 }
	 }
	 
	 System.out.println("No majority element");
	 

	}

}
