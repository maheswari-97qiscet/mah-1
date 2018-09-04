/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player167
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,n,count=0;
		n=s.length();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("yes");
		}
		else
		{
		System.out.print("no");	
		}
		
	}
}
