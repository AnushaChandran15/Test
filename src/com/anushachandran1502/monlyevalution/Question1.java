package com.anushachandran1502.monlyevalution;

import java.util.Scanner;

public class Question1 {
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=n;k++)
			{
				
			}
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
