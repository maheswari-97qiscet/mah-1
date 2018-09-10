/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player161
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int i,count=0,j;
		for(i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<s[i].length();j++)
			{
			if(s[i].charAt(j)=='a'||s[i].charAt(j)=='e'||s[i].charAt(j)=='i'||s[i].charAt(j)=='o'||s[i].charAt(j)=='u')
			{
				count++;
			}
			else
			{
				continue;
			}
			}
		}
		if(count>0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
