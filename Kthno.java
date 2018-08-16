/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Kthno
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int N[]=new int[n];
		for(i=0;i<n;i++)
		{
			N[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(N[i]==k)
			{
				System.out.print(N[i]);
			}
		}
	
	}
}
