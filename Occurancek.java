/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Occurancek
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int i,count=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			if(rem==k)
			{
				count=count+1;
			}
			n=n/10;
		}
		 System.out.print(count);


	}
}
