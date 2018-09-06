/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player96
{
	public static void main (String[] args) throws java.lang.Exception
	{
			  Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  int last=n%10;
			  int first=0;
			  while(n>=1)
			  {
				  first=n;
				  n=n/10;
			  }
			 System.out.print(last+first);

				
				
	}
}
