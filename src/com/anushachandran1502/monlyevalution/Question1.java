package com.anushachandran1502.monlyevalution;

import java.util.Scanner;

public class Question1 {
	public static void printPattern(int n)
	{
		int top=0,bottom=n-1;
		int left=0,right=n-1,start=1;
		int[][] arr=new int[n][n];
		while(top<bottom || left<right)
			{
				for(int i=top;i<=bottom;i++)
					{
						arr[i][left+i]=start++;
					}
				left++;
				bottom--;
				for(int j=bottom;j>=top;j--)
					{
						arr[i][right]=start++;
					}
				right--;
				for(int k=right;k>=left;k--)
					{
						if(i==left&&top!=0)
						{
							break;
						}
						arr[top][i]=start++;
					}
				top++;
				bottom--;
			}
		for(int[] line:arr){
			for(int val:line)
				{
					if(val!=0)
						System.out.printf("%3d",val);
					else
						System.out.print("  ");
				}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		printPattern(n);
	}

}
