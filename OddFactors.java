/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddFactors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				if(i%2!=0)
				{
				if(i==a-1)
				{
				System.out.print(i);	
				}
				System.out.print(i+" ");
				}
			}
		}
	}
}