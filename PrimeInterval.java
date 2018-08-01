/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
                        for(int i=a;i<=b;i++)
            	{
                        	for(int j=2;j<i;j++)
                        	{
                        		if(i%j==0)
                        		{
                        		count=0;
                        		break;
            			}
            			else
            			{
            			count=1;	
            			}
                        	}
            			if(count==1)
                        		{
                        		System.out.print( i + "\t");
                        		}
                        	
                       }
           	}
}
