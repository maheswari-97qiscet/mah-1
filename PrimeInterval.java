/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeInterval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
                        while(a<b)
                        {
		boolean flag=false;                       
                        for(int i=2;i<a/2;i++)
                        {
                        	if(a%i==0)
                        	{
                        	flag=true;
                        	break;
                        	}
                        }
                        if(!flag)
                        
                        	System.out.print(a + "\t");
                        	++a;
                       }
           	}
}
