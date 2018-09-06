/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PlAYER94
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
				int i,count=0,j;
				for(i=0;i<s.length();i++)
				{
					for(j=i+1;j<s.length();j++)
				
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				}
				if(count>1)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}

	}
}
