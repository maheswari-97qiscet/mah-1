/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strlat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print(s.charAt(i));
		}
	}
}
