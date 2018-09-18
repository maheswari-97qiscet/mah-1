/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player204
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,res=0;
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
			res=res+a[i];	
			}
		}
		if(res==0)
		{
		System.out.print("0");
		}
		else
		{
		System.out.print(res);
		}
		

	}
}
