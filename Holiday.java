
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Holiday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("Sunday")||s.equals("Saturday"))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
