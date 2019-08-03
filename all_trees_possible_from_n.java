package geeks_for_geeks;

import java.util.Scanner;

public class all_trees_possible_from_n {
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
		
	}
	Node root=null;
	public void addnode(int value)
	{
		this.root=addnodehelper(root,value);
	}
	private Node addnodehelper(Node node,int value)
	{
		if(node==null)
		{
			Node temp=new Node(value,null,null);
			node=temp;
			return node;
		}
		else
		{
			if(value<node.data)
			{
				node.left=addnodehelper(node.left,value);
			}
			else
			{
				node.right=addnodehelper(node.right,value);
			}
		}
		return node;
	}
	public void display()
	{
		displayhelper(root);
	}
	private void displayhelper(Node node)
	{
		
		if(node.left!=null)
		{
			System.out.print(node.left.data+" ");
		}
		else
		{
			System.out.print("null ");
		}
		System.out.print(node.data+" ");
		if(node.right!=null)
		{
			System.out.print(node.right.data+" ");
		}
		else
		{
			System.out.print("null");
		}
		System.out.print(",");
		if(node.left!=null)
		{
			displayhelper(node.left);
		}
		if(node.right!=null)
		{
			displayhelper(node.right);
		}
	}

	public static void main(String[] args) {
		all_trees_possible_from_n tree=new all_trees_possible_from_n();
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=i;
			tree.addnode(arr[i-1]);
		}
		
		tree.display();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				all_trees_possible_from_n tree1=new all_trees_possible_from_n();
				for(int k=0;k<n;k++)
				{
					tree1.addnode(arr[k]);
					
				}
				System.out.println();
				System.out.println("*************");
				tree1.display();
				
			}
		}
		int t=arr[n-1];
		arr[n-1]=arr[0];
		arr[0]=t;
		all_trees_possible_from_n tree1=new all_trees_possible_from_n();
		if(n>2)
		{
		for(int i=0;i<n;i++)
		{
			tree1.addnode(arr[i]);
		}
		System.out.println();
		System.out.println("**************");
		tree1.display();
		}

	}
	}


