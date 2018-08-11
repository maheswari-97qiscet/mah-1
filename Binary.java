/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Binary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='0'||s.charAt(i)=='1')
		{
		count++;
		}
		}
		if(count==s.length())
		{
			System.out.println("yes");
		}
		else
		{
		System.out.println("no");	
		}
	}
}
