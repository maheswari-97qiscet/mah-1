/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinMax
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
		int min=n2[0],max=n2[0];
		for(i=0;i<n1;i++)
		{
			if(min>n2[i])
			{
				min=n2[i];
			}
			if(max<n2[i])
			{
				max=n2[i];
			}
		
		}
		System.out.print(min+" "+max);
		
	}
}
