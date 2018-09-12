/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pro3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count=0,c=0,d=0,i;
		if(s1.length()>s2.length())
		{
			c=s1.length()-s2.length();
			if(s2.length()==1)
			{
				if(s1.contains(s2))
				{
					count=0;
				}
				else
				{
					count++;
				}
			}
			else
			{
				for(i=0;i<s2.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						count++;
					}
				}
			}
		}
		else
		{
			c=s2.length()-s1.length();
			if(s1.length()==1)
			{
				if(s2.contains(s1))
				{
					count=0;
				}
				else
				{
					count++;
				}
			}
			else
			{
				for(i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						count++;
					}
				}
			}
		}
		d=c+count;
		System.out.print(d);
	}
}
