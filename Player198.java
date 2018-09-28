/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player198
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
		int min=a[0],max=a[0],temp1=0,temp2=0;
		for(i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				temp1=i;
			}
		}
		
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				temp2=i;
			}
		}
	
		System.out.print(temp2-temp1);
}
}
