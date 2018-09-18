/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player189
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c<(a+b))
		{
			if(a!=b&&b!=c&&c!=a)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		else
		{
			System.out.print("no");
		}
	}
}
