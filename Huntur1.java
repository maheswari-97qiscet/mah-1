/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Huntur1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,count=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					if(i==n-1)
					{
					System.out.print(a[i]);
					}
					else
					{
					System.out.print(a[i]+" ");	
					}
					count=count+1;
				}
			}
		}
		if(count==0)
		{
		System.out.print("unique");	
		}

	}
}
