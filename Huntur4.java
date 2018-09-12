/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Huntur4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		char c;
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ArrayList<Character>a=new ArrayList<Character>();
		for(int i=0;i<n;i++)
		{
		 c=s.next().charAt(0);
		 a.add(c);
		}
		for(int i=0;i<n;i++)
		{
		if(Collections.frequency(a, a.get(i))==1)
		{
            	System.out.print(a.get(i));
		}
		}
	}
}
