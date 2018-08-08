/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rev
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,res=0;
		while(n!=0)
		{
			res=n%10;
			rev=rev*10+res;
			n=n/10;
		}
		System.out.print(rev);
	}
}
