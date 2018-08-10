/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NearestEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int even=0;
		if(a%2==0)
		{
			even=a-2;
		}
		else
		{
			even=a-1;
		}
		System.out.print(even);
	}
}
