/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Max
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,max=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=0;i<10;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
			System.out.println(max);
	}
}
