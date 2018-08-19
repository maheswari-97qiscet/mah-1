/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DividesBoth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,o=0;
		for(i=2;i<=n1;i++)
		{	
		if((n1%i==0)&&(n2%i==0))
		{
			o=i;
		}
		}
		System.out.print(o);
	}
}
