/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DivisiblebyBoth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=2,c=0;
		while(i>=2)
		{
			if((i%a==0)&&(i%b==0))
			{
				c=i;
				break;
			}
			i++;
		}
		System.out.print(c);

	}
}
