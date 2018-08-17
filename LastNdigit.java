/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LastNdigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String res="";
		for(int i=s.length()-n;i<s.length();i++)
		{
			res=res+s.charAt(i);
		}
		System.out.print(res);
	}
}
