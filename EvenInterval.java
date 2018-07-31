
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class EvenInterval
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 for(int i=a+1;i<=b;i++)
	 {
	 	if(i%2==0)
	 	{
	 		System.out.print(i+" ");
	 	}
	 }
	}
}
