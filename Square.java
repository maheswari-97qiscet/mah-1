/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=0,sum=0;
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem*rem;
			a=a/10;
		}
		System.out.print(sum);
	}
}
