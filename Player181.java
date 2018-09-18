/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player181
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0||n%7==0||n%10==0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
