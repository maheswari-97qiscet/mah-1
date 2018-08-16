/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddEvenPos
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,n;
		n=s.length();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.print("\t");
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
