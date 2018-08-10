/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,i;
		for(i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
