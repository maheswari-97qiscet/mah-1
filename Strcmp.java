/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Strcmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i,count=0;
		if(s1.length()==s2.length())
		{
		for(i=0;i<s1.length();i++)
		{
				if(s1.charAt(i)==s2.charAt(i))
				{
					count=1;;
				}
				else{
					count=0;
				}
		}
		}
		if(count==1)
		{
		System.out.print("yes");
		}
		else
		{
		System.out.print("no");
		}

	}
}
