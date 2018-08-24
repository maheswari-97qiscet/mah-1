/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rect
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int a=sc.nextInt();
		int pe=0,ar=0,i,j,count=0;
		for(i=1;i<=(p/2);i++)
		{
		for(j=1;j<=(p/2);j++)
		{
		  pe=2*(i+j);
		  ar=i*j;
		if(pe==p&&ar==a)
		{
			count++;
		}
		}}
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
