/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArmInter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int res=0,rem=0;
			int temp=i;
		while(temp>0)
		{
			rem=temp%10;
			res=res+rem*rem*rem;
			temp=temp/10;
		}
		if(i==res)
		{
			System.out.print(i + "\t");
		}
		}
	}
}
