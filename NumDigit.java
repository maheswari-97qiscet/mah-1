/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NumDigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum=0;
		 while(n!=0)
		 {
		 	n=n/10;
			sum=sum+1;
		 }
		 
		 	System.out.print(sum);
		 
	}
}
