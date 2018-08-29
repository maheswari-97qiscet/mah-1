/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.next();
		int i,count=0;
		int n=s1.length();
		for(i=0;i<s.length()-n;i++)
		{
			if((s.substring(i,i+n)).equals(s1))
			{
				count++;
			}
		}
		System.out.print(count);
		
	}
}
