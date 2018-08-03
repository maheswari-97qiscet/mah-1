/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n, temp,med=0;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int a[] = new int[n];
	for (int i = 0; i < n; i++) 
		 {
            		a[i] = s.nextInt();
		 }
	 for (int i = 0; i < n; i++) 
		 {
            	for (int j = i + 1; j < n; j++) 
            		{
            		if (a[i] > a[j]) 
            			{
            			 temp = a[i];
            			 a[i] = a[j];
            			a[j] = temp;
            			 }
			 }
		}
		if(n%2==0)
		{
			med=(a[n/2]+a[n/2]+1)/2;
			System.out.print(med);
		}
		else
		{
			med=a[n/2];
			System.out.print(med);
		}

	}
}
