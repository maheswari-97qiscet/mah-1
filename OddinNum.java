/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddinNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(i%2!=0)
		{
			if(i==(n-1))
			{
			System.out.print(a[i]);	
			}
			else
			{
			System.out.print(a[i]+" ");	
			}
		}
		}
	
		


	}
}
