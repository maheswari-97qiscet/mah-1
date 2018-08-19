/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int n6=sc.nextInt();
		if(n1==n5&&n3==n4||n2==n6&&n3==n4)
		{
			System.out.print("yes");
		}
		else if(n1==n2&&n3==n4&&n5==n6||n2==n4&&n5==n6&&n1==n3&&n5==n6)
		{
		System.out.print("yes");	
		}
		else
		{
		System.out.print("no");	
		}
		}
}
