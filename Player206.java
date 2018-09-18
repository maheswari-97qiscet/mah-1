/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player206
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,count=0,count1=0;
		char c;
		for(i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if((c>='0'&&c<='9')||(c>='A'&&c<='E'))
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		if(count==s.length())
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
