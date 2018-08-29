/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player56
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				System.out.print(i+1);
				break;
			}
		}
	}
}
