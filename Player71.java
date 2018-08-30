/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player71
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>a[i+1])
			{
				if(i==n-2)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
			else
			{
				if(i==n-2)
				{
					System.out.print(a[i+1]);
				}
				else
				{
					System.out.print(a[i+1]+" ");
				}

			}
		}
		
	}
}
