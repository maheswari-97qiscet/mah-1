/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProdMul
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int res=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		res=(a*b)%c;
		System.out.print(res);
	}
}
