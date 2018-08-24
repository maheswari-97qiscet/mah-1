/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class index03
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		 for(i=0;i<s.length();i=i+3)
		 {
		 	System.out.print(s.charAt(i));
		 }

	}
}
