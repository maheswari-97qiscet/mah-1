/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner	sc=new	Scanner(System.in);
int	n=sc.nextInt();
if(n%4==0)
{
	if(n%100==0)
	{
		if(n%400==0)	
		{
		System.out.println("yes");
		}
		else
		{
		System.out.println("No");
		}
	}	
	else
	{
	System.out.println("yes");	
	}
}
else
{	
	System.out.println("No");	
	}
}
}
