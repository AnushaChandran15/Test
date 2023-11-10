package com.anushachandran1502.monlyevalution;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	public static String[] lexicographically(String[] strArr)
	{
		for(int i=0;i<strArr.length;i++)
		{ 	
			strArr[i]=strArr[i].toUpperCase();
			char[] ch=strArr[i].toCharArray();
			//bubble sort use
			for(int j=0;j<strArr[i].length();j++)
			{
				for(int k=0;k<strArr[i].length()-1;k++)
				{
					if(ch[k]<ch[k+1])
					{
						char temp=ch[k+1];
						ch[k+1]=ch[k];
						ch[k]=temp;
					}
				}
			}
			strArr[i]=String.valueOf(ch);
		}
		Arrays.sort(strArr);
		return strArr;
	}
	public static void print(String[] arr)
	{
		int j=1;
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("String "+j+ " : "+arr[i]);
			j++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Number of String to be entered");
		int n=scan.nextInt();
		scan.nextLine();
		String[] strArr=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a String index of "+ i);
			strArr[i]=scan.nextLine();
		}
		scan.close();
		System.out.println("Your input Strings : "+Arrays.toString(strArr));
		print((lexicographically(strArr)));
	}

}
