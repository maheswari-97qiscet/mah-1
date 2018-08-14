/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Lcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0,i,lcm=0;
		for(i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				c=i;
			}
		}
		lcm=(a*b)/c;
		System.out.print(lcm);
	}
}
