/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Add3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String res="";
		String s= sc.next();
		for(i=0;i<s.length();i++)
		{
			res=res+Character.toString((char)((int)s.charAt(i)+3));
		}
		System.out.print(res);
		
	}
}
