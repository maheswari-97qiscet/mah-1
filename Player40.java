/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0,j,a=0;
		for(i=0;i<=n;i++)
		{
			for(j=n;j>=0;j--)
			{
				a=((i*1)+(2*j));
		if(a==n)
		{
			count=count+1;
		}
		}
		}
		System.out.print(count);
	}
}
