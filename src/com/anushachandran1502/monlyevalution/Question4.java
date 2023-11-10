package com.anushachandran1502.monlyevalution;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static void patternPrint(String str,int rows)
	{
		char[][] ch=new char[rows][str.length()];
		int index=0;
		int row=0;
		int col=0;
		boolean down=false;
			while(index<str.length())
			{
				ch[row][col]=str.charAt(index++);
				if(row==0)
				{
					down=false;
				}
				else if(row==rows-1)
				{
					down=true;
				}
				if(down)
				{
					row--;
					col++;
				}
				else
				{
					row++;
				}	
			}
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<str.length();j++)
				{
					System.out.print(ch[i][j]+" ");
				}
				System.out.println();
			}
			
			//System.out.println(Arrays.deepToString(ch));
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		//scan.nextLine();
		System.out.println("Enter a rows");
		int rows=scan.nextInt();
		scan.close();
		patternPrint(str,rows);
	}

}
