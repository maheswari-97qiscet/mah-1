
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,temp=0;
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int count=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		if(count>temp)
		{
			temp=count;
		}
		}
		System.out.print(temp);
	
	}
}
