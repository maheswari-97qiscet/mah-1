/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.print(count);

	}
}
