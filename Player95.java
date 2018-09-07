/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player95
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int p=sc.nextInt();
		int k=sc.nextInt();
		int i;
		for(i=0;i<s.length();i++)
		{
			if(i==p)
			{
				System.out.print(s.charAt((i-1)+k));
			}
		}
		
	}
}
