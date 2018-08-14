/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digitseperate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		for(i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
