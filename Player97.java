/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player97
{
	public static void main (String[] args) throws java.lang.Exception
	{
			  Scanner sc=new Scanner(System.in);
			  int a=sc.nextInt();
			  int b=sc.nextInt();
			  int i,sum=0;
			  for(i=a;i<=b;i++)
			  {
			  	if(i%2!=0)
			  	{
			  		sum=sum+i;
			  	}
			  }
			 System.out.print(sum);

				
				
	}
}
