/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player195
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int c=n%p;
		if(c==0)
		{
			System.out.print(p);
		}
		else
		{
			System.out.print(c);
		}
	}
}
