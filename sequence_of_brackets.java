package geeks_for_geeks;

import java.util.Scanner;
import java.util.Stack;

public class sequence_of_brackets {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char []arr=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.next().charAt(0);
		}
		Stack<Character> s=new Stack<>();
		int i=0;
		while(i<n)
		{
			if(arr[i]=='('||arr[i]=='['||arr[i]=='{') 
				{
					s.push(arr[i]);
				}
			else if(arr[i]==')')
			{
				char x=s.pop();
				if(x=='(')
				{
					
				}
				else
				{
					System.out.println("Invalid");
					return;
				}
			}
			else if(arr[i]=='}')
			{
				char x=s.pop();
				if(x=='{')
				{
					
				}
				else
				{
					System.out.println("Invalid");
					return;
				}
			}
			else if(arr[i]==']')
			{
				char x=s.pop();
				if(x=='[')
				{
					
				}
				else
				{
					System.out.println("Invalid");
					return;
				}
			}
			i++;
		}
		if(s.isEmpty())
		System.out.println("Valid");
		else
			System.out.println("Invalid");
		return;
		

	}

}
