/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CeltoKel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int kel=0;
		double cel=sc.nextInt();
		kel=(int)(cel+273.5);
		System.out.print(kel);
	}
}
