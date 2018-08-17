/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DividebyTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int a;
		
		 Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 while(a!=1)
		 {
		 if(a%2!=0)
		 {
			  break;
		  }
		a=a/2;

		}
		System.out.println(a);

	}
}
