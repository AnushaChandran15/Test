package com.anushachandran1502.monlyevalution;

import java.util.Scanner;

public class Question2 {
	public static boolean isJumbledNumber(int num)
	{ boolean flag=true;
		while(num>0)
		{
			int rem1=num%10;
			num/=10;
			int rem2=num%10;
			num/=10;
			if(rem1-1==rem2)
			{
				flag=true;
			}
			else if(rem1+1==rem2)
			{
				flag=true;
			}
			else 
			{
				flag=false;
				break;
			}
		}
			return flag;
	}
	public static void print(boolean flag,int num)
	{
		if(flag)
		{
			System.out.println(num+" is a jumbled number");
		}
		else
			System.out.println(num+" is not a jumbled number");
	}
	 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		scan.close();
		System.out.println("Enter the Number is : "+num);
		print(isJumbledNumber(num),num);
		
	}

}
