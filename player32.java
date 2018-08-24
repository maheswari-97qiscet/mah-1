/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class player32
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int i,count=0;
		int a[]=new int[n];
		 for(i=0;i<n-1;i++)
		 {
		 	a[i]=sc.nextInt();
		 }
		
		 for(i=0;i<n;i++)
		 {
		 if(a[i]==k)
		 {
		 	count=1;
		 }
		 }
		 if(count==1)
		 {
		System.out.print("yes");
		 }
		 else
		 {
		 	System.out.print("no");
		 }

	}
}
