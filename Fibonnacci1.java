/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonnacci1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=0,t2=1,sum=0;
		for(int i=0;i<n;i++)
		{
		System.out.println(t2+" ");
		sum=t1+t2;
		t1=t2;
		t2=sum;
		}
	
	}
}
