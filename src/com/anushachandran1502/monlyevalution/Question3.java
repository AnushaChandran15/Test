package com.anushachandran1502.monlyevalution;

import java.util.Scanner;

public class Question3 {
	public static void isValidExpression(String exp)
	{
//		int count=0;
//		for(int i=0;i<exp.length();i++)
//		{
//			if(exp.charAt(i)=='(')
//			{
//				count++;
//			}
//			else if(exp.charAt(i)==')')
//			{
//				count--;
//			}
//			if(count<0)
//				return false;
//		}
//		
//		return count==0;
			int i=0,count=0;
			char[] ch=exp.toCharArray();
			for(i=0;i<exp.length();i++)
			{
				if(ch[i]=='(')
				{
					count++;
				}
				else if(ch[i]==')')
				{
					count--;
				}
				else if(ch[i]=='*'|| ch[i]=='/' || ch[i]=='+' || ch[i]=='-')
				{
					if(ch[i-1]>97 && ch[i=1]<123 && ch[i-1]>97 && ch[i=1]<123)
					{
						continue;
					}
					else
					{
						break;
					}
				}
			}
			if(i==exp.length() && count==0)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
			
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a expression");
		String exp=scan.nextLine();
		scan.close();
	isValidExpression(exp);
	}

}
