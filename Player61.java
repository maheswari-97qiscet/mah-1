/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player61
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int i,res=0,j,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		for(j=i;j<n;j++)
			{
			res=a[i]+a[j];
		if(res==k)
		{
		count=1;
		break;
		}
		}
		if(count==1)
		break;

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
