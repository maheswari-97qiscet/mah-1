/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player15
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char[] a=str.toCharArray();
                char d=' ';
		for(int i=0;i<a.length-1;i++){  
			if(a[i]==a[i+1]){
			d=a[i+1];
			}
		}
		
		System.out.print(d);

	}
}
