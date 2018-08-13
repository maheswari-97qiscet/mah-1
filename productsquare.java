/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class productsquare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		if((n*n1)/n==n||(n*n1)/n1==n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
	
		}
	}
}
