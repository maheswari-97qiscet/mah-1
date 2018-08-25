/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class player50
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i,count=0;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
			count=1;
			System.out.print("yes");
			break;
			}
			else
			{
			count=0;
			}
		}
		if(count==0)
		{
		System.out.print("no");
		}
		
	}
}
