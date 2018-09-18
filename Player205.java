/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player205
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				int a=c-32;
				char d=(char)a;
				System.out.print(d);
			}
			else if(c>='A'&&c<='Z')
			{
				int a=c+32;
				char d=(char)a;
				System.out.print(d);
			}
			else
			{
				System.out.print(c);
			}
		}
	}
}
