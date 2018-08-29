/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player62
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,x;
		while(i>0)
		{
			if(n%i==0)
			{
			x=n/i;
			if(x%2==1)
			{
			System.out.print(i);
			break;
			}
			}
			i++;
		}

	}
}
