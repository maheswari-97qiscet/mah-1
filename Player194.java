/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player194
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(((s1.equals("P"))&&(s2.equals("S")))||((s1.equals("S"))&&(s2.equals("P"))))
		{
			System.out.print("S");
		}
		else if(((s1.equals("P"))&&(s2.equals("R")))||((s1.equals("R"))&&(s2.equals("P"))))
		{
			System.out.print("P");	
		}
		else if(s1.equals(s2))
		{
			System.out.print("D");
		}
		else
		{
			System.out.print("R");
		}

	}
}	
