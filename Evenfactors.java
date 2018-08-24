/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Evenfactors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					if(i==n)
					{
					System.out.print(i);
					}
					else
					{
					System.out.print(i+" ");
					}
				}
			}
		}
	}
}
