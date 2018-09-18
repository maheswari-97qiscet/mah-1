/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player190
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
