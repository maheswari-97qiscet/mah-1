/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SimpleInterest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int si=0;
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		si=(p*t*r)/100;
		System.out.println(si);
	}
}
