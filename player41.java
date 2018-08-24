/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class player41
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int k=sc.nextInt();
		int i,count=0;
		for(i=0;i<n;i++)
		{
		if(Math.pow(k,i)==n)
		{
		count=1;	
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
