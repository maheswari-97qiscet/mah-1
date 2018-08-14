/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cuboid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		int Area=2*(l*w+w*h+h*l);
		int vol=l*h*w;
		System.out.println(Area+" "+vol);
	}
}
