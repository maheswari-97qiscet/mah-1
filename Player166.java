/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player166
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,j,f1=1,f2=1,c=0;
		for(i=1;i<=n1;i++)
		{
			f1=f1*i;
		}
		for(i=1;i<=n2;i++)
		{
			f2=f2*i;
		}
		for(i=1;i<=f1&&i<=f2;i++)
		{
			if(f1%i==0&&f2%i==0)
			{
				c=i;
			}
		}
		System.out.println(c);

	}
}
