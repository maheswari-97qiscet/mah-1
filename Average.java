/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0,i,res=0;
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2[]=new int[n1];
		for(i=0;i<n1;i++)
		{
			n2[i]=sc.nextInt();	
		}
		for(i=0;i<n1;i++)
		{
			count=count+n2[i];
		}
		res=count/n1;
		System.out.print(res);
		
	}
}
